@ECHO OFF
SETLOCAL
IF NOT "%MAVEN_HOME%"=="" (
  "%MAVEN_HOME%\bin\mvn.cmd" %*
  EXIT /B %ERRORLEVEL%
)
WHERE mvn >NUL 2>&1
IF %ERRORLEVEL% EQU 0 (
  mvn %*
  EXIT /B %ERRORLEVEL%
)
ECHO Apache Maven is required to build this project.
EXIT /B 1
