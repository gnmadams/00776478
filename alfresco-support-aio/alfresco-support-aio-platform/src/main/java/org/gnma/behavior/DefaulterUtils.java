package org.gnma.behavior;

import org.alfresco.util.ISO9075;
import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaulterUtils {
	// Use private constructor to hide it.
	private DefaulterUtils() {
		// Purposely left empty.
	}

	// Helper methods
	/**
	 * Given Content Type, Generate a URI
	 * 
	 * @param contentType
	 * @return
	 */
	public static final String getURI(String contentType) {

		if (contentType.startsWith("cm:")) {
			return String.format(BehaviorConstants.NAMESPACE_CM, contentType.split(":")[0]);
		}

		return String.format(BehaviorConstants.NAMESPACE_FMT_GNMA, contentType.split(":")[0]);
	}

	/**
	 * Given a content type, returns just the value after the colon.
	 * 
	 * @param contentType
	 * @return
	 */
	public static final String getModelType(String contentType) {
		try {

			return contentType.split(":")[1];

		} catch (ArrayIndexOutOfBoundsException aioobe) {
			throw new IllegalArgumentException(
					"Cannot get Model Type. Missing namespace. ie: cm:content where \"cm\" is the namespace.");
		}
	}

	/**
	 * Remove URI's from Namespacing to make it easier to compare with.
	 * 
	 * @param path
	 * @return
	 */
	public static final String removeURIsFromPath(String path) {

		return path.replace("{http://www.alfresco.org/model/application/1.0}", "")
				.replace("{http://www.alfresco.org/model/site/1.0}", "")
				.replace("{http://www.alfresco.org/model/content/1.0}", "");
	}

	/**
	 * Encode a path to make it Alfresco Friendly and comparable.
	 * 
	 * @param path
	 * @return
	 */
	public static String encodePath(String path) {
		StringBuilder cleanedPath = new StringBuilder();

		// The path starts with / which will end up being // after cleanup, so lets
		// AVOID IT by stripping it off
		String[] directories = StringUtils.stripStart(path, "/").split("/");

		// Encode each piece and reassemble as a path
		for (String d : directories) {
			cleanedPath.append("/").append(ISO9075.encode(d));
		}

		log.trace("Cleaned path: " + cleanedPath);

		return cleanedPath.toString();
	}

	/**
	 * Derived from a Site and a Folder, whether or not the derived path starts with
	 * the passed path.
	 * 
	 * @param site
	 * @param folder
	 * @param path
	 * @return
	 */
	public static boolean mappingMatchesPath(String site, String folder, String path) {
		String comparingPath = String.format("/company_home/sites/%s/documentLibrary/%s", site, folder);

		comparingPath = encodePath(comparingPath);

		return path.startsWith(comparingPath);

	}

	/**
	 * Remove leading and trailing brackets from list.
	 * 
	 * @param list
	 * @return
	 */
	public static final String removeBracketsFromList(String list) {

		String cleanList = StringUtils.stripStart(list, "[");
		return StringUtils.stripEnd(cleanList, "]");
	}

	/**
	 * Checks if this is a new site/division/folder path.
	 * 
	 * @param path
	 * @return
	 */
	public static boolean isNewFolder(String path) {

		for (String[] mapping : BehaviorConstants.defaultContentTypeMap) {

			String site = mapping[0];
			String folder = mapping[1];

			if (mappingMatchesPath(site, folder, path)) {
				return false;
			}
		}

		return true;

	}

}
