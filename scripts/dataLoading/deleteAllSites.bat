:: The following script will delete all sites in the alfresco system.
@echo off
echo WARNING: This script will delete all data inside a site including the site itself.  
echo Be sure you select the correct profile!

::Prompt for Profile
call subScripts/promptProfile.bat

IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --host %SHARE_HOST% --user "%AUTH_USER%" --pw "%AUTH_PW%" -a deleteAllSites --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL% --logFilename=%LOGFILE%

echo Note: For sites with a lot of data, its common to recieve failures. You may also continue to see the site on the UI. Alfresco may take some time to finish the delete.
:end
call subScripts/endScript.bat