
IF "%EDRM_PROFILE%"=="" set /p EDRM_PROFILE="EDRM Profile (e.g. capital_markets): "
IF "%EDRM_CSV_FILE%"=="" set /p EDRM_CSV_FILE="EDRM CSV File: "

if not exist "%GNMA_HOME%/scripts/env/%PROFILE%.bat" echo Profile %PROFILE% not found. stopping script. && set "PROFILE="
if not exist "%LOCATION_TEMPLATE_FILES%\edrm\%EDRM_PROFILE%\%EDRM_CSV_FILE%.csv" echo EDRM CSV File %EDRM_CSV_FILE% not found. stopping script. && set "EDRM_CSV_FILE="


call %GNMA_HOME%/scripts/env/%PROFILE%.bat