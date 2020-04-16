# Vonage sample CI/CD
Example CI/CD flow

Verify docker installation
```
PS C:\Projects\vonage> docker --version
Docker version 19.03.8, build afacb8b
```
Verify docker compose installation:
```
PS C:\Projects\vonage> docker-compose --version
docker-compose version 1.25.4, build 8d51620a
```
Build the package and unit test:
```
docker-compose -f docker/build/docker-compose.yml --project-directory . up --build
```
Build the application image and run it:
```
docker-compose -f docker/run/docker-compose.yml --project-directory . up --build
```