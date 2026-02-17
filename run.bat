@echo off
echo Starte Frontend und Backend...

:: Frontend (Angular)
start cmd /k "cd frontend && ng serve --host 0.0.0.0"

:: Backend (Gradle)
start cmd /k "cd backend && gradlew bootRun"

echo Beide Server wurden gestartet.
