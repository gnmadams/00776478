package org.gnma.behavior;

import org.alfresco.service.cmr.repository.NodeRef;
import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.namespace.QName;
import org.alfresco.util.ISO9075;
import org.apache.commons.lang3.StringUtils;

import lombok.Getter;
import lombok.extern.log4j.Log4j;

@Getter
@Log4j
public class ContentDefaulter {
	private NodeRef nodeRef;
	private NodeService nodeService;
	private QName originalType;
	private String path;
	private QName newType;

	/**
	 * Constructor
	 * 
	 * @param nodeRef
	 * @param originalType
	 * @param nodeService
	 */
	public ContentDefaulter(NodeRef nodeRef, QName originalType, NodeService nodeService) {
		this.originalType = originalType;
		this.nodeRef = nodeRef;
		this.nodeService = nodeService;
		this.path = DefaulterUtils.removeURIsFromPath(this.nodeService.getPath(nodeRef).toString());
		this.newType = getNewType();
	}

	/**
	 * Get the calculated Content Type.
	 * 
	 * @return
	 */
	public QName getNewType() {

		log.debug("Finding default content type from path: " + path);

		for (String[] mapping : BehaviorConstants.defaultContentTypeMap) {

			String site = mapping[0];
			String folder = mapping[1];
			String defaultType = mapping[2];

			log.debug("Checking Map Array: (" + site + "," + folder + "," + defaultType + ") ");

			if (DefaulterUtils.mappingMatchesPath(site, folder, path)) {
				log.debug("Mapping Found. Using default type " + defaultType);
				return QName.createQName(DefaulterUtils.getURI(defaultType), DefaulterUtils.getModelType(defaultType));
			}
		}
		return originalType;
	}

	/**
	 * Get the field that will be holding the Subtype.
	 * 
	 * @return
	 */
	public QName getSubTypeField() {
		log.debug("Namespace URI: " + newType.getNamespaceURI());

		return QName.createQName(newType.getNamespaceURI(), BehaviorConstants.SUBTYPE_PROPERTY_NAME);
	}

	/**
	 * Get the calculated Sub-Content Type.
	 * 
	 * @return
	 */
	public String getSubContentType() {
		String[] directories = StringUtils.stripStart(path, "/").split("/");
		String subContentType = null;

		if (containsSubContentType())
			subContentType = ISO9075.decode(directories[BehaviorConstants.SUBCONTENTTYPE_DEPTH - 1]);

		return subContentType;
	}

	/**
	 * Whether or not the content contains a subcontent type in its path.
	 * 
	 * @return
	 */
	public boolean containsSubContentType() {
		return StringUtils.countMatches(path, "/") >= (BehaviorConstants.SUBCONTENTTYPE_DEPTH + 1); // Add 1 because of the
																									// leading /
	}

	/**
	 * Whether or not the Content Type changed from the previous type.
	 * 
	 * @return
	 */
	public boolean typeHasChanged() {
		return (!originalType.equals(newType));
	}

	/**
	 * Checks if the Sub Content Type value is in the allowed list of values.
	 * 
	 * @param subContentType
	 * @param allowedList
	 * @return
	 */
	public boolean isSubtypeValueAllowed(String subContentType, String allowedList) {

		log.debug("Checking subtype value against the allowed list");

		String[] valuesList = StringUtils.split(DefaulterUtils.removeBracketsFromList(allowedList), ",");

		for (String value : valuesList) {
			log.debug("Checking subtype against value: " + value);

			if (subContentType.equals(value.strip())) {
				return true;
			}
		}

		return false;
	}

}
