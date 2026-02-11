@echo off
echo Starte Frontend und Backend...

:: Frontend (Angular)
start cmd /k "cd frontend && ng serve"

:: Backend (Gradle)
start cmd /k "cd backend && gradlew bootRun"

echo Beide Server wurden gestartet.
