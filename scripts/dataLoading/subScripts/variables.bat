SET CONTENT_IMPORT_FILENAME=content-importer-1.0.jar
SET CONTENT_IMPORTER_VERSION=02.28.2022.10.33PM
SET DEBUG_LVL=TRACE
SET PROPS_LOC=%GNMA_HOME%/scripts/dataLoading/importTemplates/ETL.properties
SET PROFILE_DIR=%GNMA_HOME%/scripts/env

SET LOCATION_TEMPLATE_FILES=%GNMA_HOME%\scripts\dataLoading\importTemplates
SET LOCATION_OUTLOOK_LICENSES=%LOCATION_TEMPLATE_FILES%\outlookIntegrationLicenses.txt
SET LOCATION_OUTLOOK_CONFIG=%LOCATION_TEMPLATE_FILES%\outlookIntegrationConfig.txt

::Webscript base URL
SET URI_WS_BASE=/alfresco/s

:: Office Integration
SET URI_OUTLOOK_INTEGRATION=%URI_WS_BASE%/wps/mail
SET URI_OUTLOOK_INTEGRATION_CLIENT=%URI_OUTLOOK_INTEGRATION%/license/client/Outlook
SET URI_OUTLOOK_INTEGRATION_SERVER=%URI_OUTLOOK_INTEGRATION%/license/server/allLicenses
SET URI_OUTLOOK_INTEGRATION_CONFIG=%URI_OUTLOOK_INTEGRATION%/integration/config

set URI_LDAP_SYNC=%URI_WS_BASE%/enterprise/admin/admin-sync

:: Template File Variables - Used for different environments
SET TEMPLATE_USERS=%LOCATION_TEMPLATE_FILES%/users.csv

SET CONTENT_MANIFEST_FILE=%GNMA_HOME%/scripts/dataLoading/importTemplates/content.csv
SET LOGFILE="logs/content-importer-<action>-<datetime>"
SET UNIT_TESTING_PROPERTIES=%GNMA_HOME%/scripts/dataLoading/unitTestingProfiles/dev.properties
