:: The following script will batch load Sites
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a groupsUpload -f "%GNMA_HOME%/scripts/dataLoading/importTemplates/groups.csv" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL% --filter="ldapOnly=FALSE"  --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat