call %GNMA_HOME%/scripts/dataLoading/subScripts/variables.bat



if not defined PROFILE ( 
 java -jar %CONTENT_IMPORT_FILENAME% --action getVersion --logFilename=%LOGFILE%

 echo ____________________________________________________________
 echo List of available profiles:
 echo ---------------------------
 for /f %%x in ('dir /b /on "%PROFILE_DIR%\*.bat"') do @echo %%~nx
 echo ____________________________________________________________

 set /p PROFILE="Type desired Profile: "

)

if not exist "%GNMA_HOME%/scripts/env/%PROFILE%.bat" echo Profile %PROFILE% not found. stopping script. && set "PROFILE="

call %GNMA_HOME%/scripts/env/%PROFILE%.bat

IF "%AUTH_USER%"=="" set /p AUTH_USER="Admin User (press ENTER for default): "
IF "%AUTH_USER%"=="" set AUTH_USER="admin"

IF "%AUTH_PW%"=="" set /p AUTH_PW="Admin Pw (press ENTER for default): "
IF "%AUTH_PW%"=="" set AUTH_PW="admin"
