## Spring Boot logbook: Log Request And Response Body
 
- Using org.zalando.logbook library
- Check request and response logs in the console
- Excluding this endpoint to be logged '/health/info' , '/admin/**'


    - Post Request : it will log in the console

    curl --location --request POST 'localhost:8081/users' \
        --header 'APP_ID: test-api' \
        --header 'Content-Type: application/json' \
        --data-raw '{
        "name": "John",
        "email": "john123@mail.com"
    }'


    - Get Request : health/info -> it will not log in the console


    curl --location --request GET 'localhost:8081/health/info' \
    --header 'APP_ID: test-api' \
    --header 'Content-Type: application/json' 