:: The following script will load Outlook integration metadataprompt settings
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a uploadOutlookPromptConfig -f "%GNMA_HOME%/scripts/dataLoading/importTemplates/folders.csv" -t "%GNMA_HOME%/scripts/dataLoading/importTemplates/contentUploaderTemplates" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL%  --logFilename=%LOGFILE%

echo Applying Outlook Integration Settings
java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a jsonPost --jsonFormat json --uri "%URI_OUTLOOK_INTEGRATION_CONFIG%" -f "%LOCATION_OUTLOOK_CONFIG%" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL%  --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat