:: The following script will Delete existing Sites, Create new Sites, and upload files to these new Sites
@echo off

set /p GNMA_HOME="Absolute path to project directory (ie: C:\opt\alfresco_support_sdk):"

echo Installing content/users/categories/sites/taxonomy/outlook integration config and licenses
::do not show message to end script
set SUPRESS_END_PROMPT=Y

::Prompt for Profile
call subScripts/promptProfile.bat
IF "%PROFILE%" == "" GOTO :end
echo Loading Sites
call loadSites.bat

echo Loading Groups
call loadGroups.bat

echo Loading Users
call loadUsers.bat

echo Loading Folders
call loadFolders.bat

echo Loading Categories
call loadCategories.bat

echo Loading Content
call loadContent.bat

echo Loading Outlook Licenses
call updateOutlookLicenses.bat

echo Loading Outlook Search Settings
call updateOutlookSearchSettings.bat

:end

set SUPRESS_END_PROMPT=
call subScripts/endScript.bat