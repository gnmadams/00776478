package org.gnma.behavior;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.alfresco.repo.node.NodeServicePolicies;
import org.alfresco.repo.policy.Behaviour;
import org.alfresco.repo.policy.Behaviour.NotificationFrequency;
import org.alfresco.repo.policy.JavaBehaviour;
import org.alfresco.repo.policy.PolicyComponent;
import org.alfresco.service.cmr.dictionary.ConstraintDefinition;
import org.alfresco.service.cmr.dictionary.DictionaryService;
import org.alfresco.service.cmr.dictionary.PropertyDefinition;
import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.namespace.NamespaceService;
import org.alfresco.service.namespace.QName;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Class created to default content types in the repository based on the
 * directory structure as well as Outlook Metadata Prompt values.
 * 
 * @author Shawn Bonham
 *
 */
@Getter
@Setter
@Slf4j
public class DefaultContentType implements NodeServicePolicies.OnUpdatePropertiesPolicy {

	private static final String ON_UPDATE_PROPERTIES = "onUpdateProperties";

	private NodeService nodeService;

	private DictionaryService dictionaryService;

	private PolicyComponent policyComponent;

	private Behaviour onUpdateProperties;

	/*
	 * Initializer method.
	 */
	public void init() {

		log.debug("Initializing onUpdateProperties behavior.");

		this.onUpdateProperties = new JavaBehaviour(this, ON_UPDATE_PROPERTIES, NotificationFrequency.EVERY_EVENT);

		this.policyComponent.bindClassBehaviour(QName.createQName(NamespaceService.ALFRESCO_URI, ON_UPDATE_PROPERTIES),
				BehaviorConstants.CM_CONTENT, this.onUpdateProperties);

	}

	/*
	 * Method that is invoked on update of properties of a Node
	 */
	@Override
	public void onUpdateProperties(NodeRef nodeRef, Map<QName, Serializable> before, Map<QName, Serializable> after) {

		QName originalType = this.nodeService.getType(nodeRef);

		log.debug("Current Node Type: " + originalType);

		log.debug("Invoking onUpdateProperties behavior on Node.");

		String path = DefaulterUtils.removeURIsFromPath(this.nodeService.getPath(nodeRef).toString());
		log.debug("Node Path: " + path);

		// Skip updating Type and Sub Type values of this is a RM related transaction.
		if (!path.startsWith("/company_home/sites/rm/") && !DefaulterUtils.isNewFolder(path)) {
			doDefaultContentType(nodeRef, originalType);
		} else {
			// We only care about seeing paths starting at SITES, and a site not in our
			// business logic
			if (path.startsWith("/company_home/sites") && DefaulterUtils.isNewFolder(path)
					&& !path.startsWith("/company_home/sites/surf-config"))
				log.warn("Warning during onUpdateProperties: Folder path not found in current site/division list: "
						+ path);
		}

	}

	/**
	 * Default the content type based on Path when inserting data.
	 * 
	 * @param nodeRef
	 * @param originalType
	 */
	private void doDefaultContentType(NodeRef nodeRef, QName originalType) {

		ContentDefaulter contentDefaulter = new ContentDefaulter(nodeRef, originalType, nodeService);

		log.debug("Defaulting Content Type.");
		log.debug("Node: " + nodeRef);
		log.debug("Current Node Type: " + originalType);
		log.debug("Current Path: " + contentDefaulter.getPath());

		QName newType = contentDefaulter.getNewType();

		log.debug("Generated new type: " + newType);

		// If content type differs from generated new type
		if (contentDefaulter.typeHasChanged()) {
			log.debug("Default type doesnt equal new type so lets update it with: " + newType);
			this.nodeService.setType(nodeRef, newType);
			log.debug("Node Type saved as: " + this.nodeService.getType(nodeRef));
		}

		// Update content sub type.
		String subContentType = contentDefaulter.getSubContentType();
		log.debug("Calculated Subtype: " + subContentType);
		log.debug("Subtype Field Name: " + contentDefaulter.getSubTypeField());

		PropertyDefinition propDef = this.dictionaryService.getProperty(contentDefaulter.getSubTypeField());

		List<ConstraintDefinition> constraintDefs = new ArrayList<>();

		try {
			constraintDefs = propDef.getConstraints();
		} catch (NullPointerException e) {
			log.debug("Tried to get constraints on a model that does not contain constraints ({})",
					contentDefaulter.getSubTypeField());
		}

		// Update sub type if value is in the list of allowed values.
		if (subContentType != null && !subContentType.isBlank() && !constraintDefs.isEmpty()) {

			for (ConstraintDefinition cd : constraintDefs) {
				log.debug("Subtype constraint params size: " + cd.getConstraint().getParameters().size());

				if (cd.getConstraint().getParameters().size() > 0
						&& cd.getConstraint().getParameters().containsKey("allowedValues")) {

					String allowedList = cd.getConstraint().getParameters().get("allowedValues").toString();

					if (contentDefaulter.isSubtypeValueAllowed(subContentType, allowedList)) {
						log.debug("Sub Type value is valid: " + subContentType);
						this.nodeService.setProperty(nodeRef, contentDefaulter.getSubTypeField(), subContentType);
						log.debug("Sub Type saved as: " + subContentType);
					} else {
						log.error("Subtype value is not in the allowed list: " + subContentType);
					}
				}
			}

		} else {
			log.debug("Did not update subtype.");
		}

		log.debug("Returning from behavior.");

	}

}
