:: The following script will batch load Sites
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

echo Applying Client License
java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a jsonPost --jsonFormat jsonFormData --uri "%URI_OUTLOOK_INTEGRATION_CLIENT%" -f "%LOCATION_OUTLOOK_LICENSES%" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL%  --logFilename=%LOGFILE%

echo Applying Server License
java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a jsonPost --jsonFormat jsonFormData --uri "%URI_OUTLOOK_INTEGRATION_SERVER%" -f "%LOCATION_OUTLOOK_LICENSES%" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL%  --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat