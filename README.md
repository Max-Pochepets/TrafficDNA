# Traffic DNA test assignment

This is a simple service to track user results through levels.

### Endpoints
GET /userInfo/{userId} - receive information about top 20 results of the player through all levels;

GET /levelInfo/{levelId} - receive information about top 20 player on certain level;

PUT /setInfo - send a request to set information about the player. Body:
```json
{
  "user_id",
  "level_id",
  "result"
}
```

## How to start the project
1. Go to root folder of the project
2. Run `mvn clean install`
3. Run `mvn spring-boot:run`
4. Now you can send requests to `localhost:8080`
