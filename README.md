# Work in progress :) 

Murder Mystery or in german: Krimi Dinner

## About

A murder mystery is an interactive game where you and your guests each take on a role and work together to solve a fictional crime. 

Every player gets their own character with a unique backstory and secret information. One of you is the killer but at the start of the evening, nobody knows who except the game master (depending on the format).

Everyone is a suspect, and as the night unfolds you piece together clues through conversation to unmask the murderer. Along the way there's food, speculation, and plenty of pointing fingers... guaranteed to make for an unforgettable evening.

Source: [mitmach-krimi.de](https://www.mitmach-krimi.de/blogs/news/krimidinner-selber-machen?srsltid=AfmBOorHvCNrkfaACri6DVxfpblkezbZYjIFS84RbwyXra0_ur2eaTxr#:~:text=Was,sorgt)

## Tech Stack
**Backend**: Java 21 with Spring Boot. Exposes a REST API and reads story data from a local JSON file using Jackson for deserialization.

**Frontend**: Angular 21. Calls the backend via `HttpClient` and renders the stories as cards on a dashboard.

**Database**: "Noch in Kinderschuhen". The project is still in its early stages, so story data is served from a static JSON file for now. A proper database will be introduced once the core features are in place :)

## Current Folder Structure

**Backend** `backend/src/main/`
- `java/com/example/murder_mystery/controller`
- `java/com/example/murder_mystery/service`
- `java/com/example/murder_mystery/repository`
- `java/com/example/murder_mystery/entity`
- `java/com/example/murder_mystery/config`
- `resources/data/stories.json`

**Frontend** `frontend/src/app/`
- `**components`
- `services/`
- `models/`
