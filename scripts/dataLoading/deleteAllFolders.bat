:: The following script will delete all divisional directories, which means anything contained within this structure will also delete.
@echo off

::Prompt for Profile
call subScripts/promptProfile.bat

IF "%PROFILE%" == "" GOTO :end

java -jar %CONTENT_IMPORT_FILENAME% --filter="parentfolder=documentLibrary" --host "%SHARE_HOST%" --user "%AUTH_USER%" --pw "%AUTH_PW%" -a foldersDelete -f "%GNMA_HOME%/scripts/dataLoading/importTemplates/folders.csv" --jks="%JKS%" --jkspw="%JKS_PW%" --props="%PROPS_LOC%" -v %DEBUG_LVL% --logFilename=%LOGFILE%

:end
call subScripts/endScript.bat