:: The following script will update the folder permissions based on whats in the template.
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a folderPermissionsUpdate -f "%GNMA_HOME%/scripts/dataLoading/importTemplates/folders.csv" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL% --timeout %REQUEST_TIMEOUT% --updateDocumentLibraryPermissions  --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat