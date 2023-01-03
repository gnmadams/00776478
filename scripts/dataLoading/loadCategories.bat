:: The following script will batch load Categories
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a categoriesUpload -f "%GNMA_HOME%/scripts/dataLoading/importTemplates/categories.csv" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL% --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat