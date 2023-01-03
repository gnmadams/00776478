:: The following script will Delete existing Sites, Create new Sites, and upload files to these new Sites using a filter expression.
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

set /p FILTER="Filter (ie: apm:apmYear=1997): "
java -jar %CONTENT_IMPORT_FILENAME% --user "%AUTH_USER%" --pw "%AUTH_PW%" -a contentUpload --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" --filter="%FILTER%"  -H "%SHARE_HOST%" -f "%CONTENT_MANIFEST_FILE%" -d "%GNMA_HOME%/scripts/dataLoading/files" -v %DEBUG_LVL% --logFilename=%LOGFILE%


:end
call subScripts/endScript.bat
