# spring-boot-exception-handler
spring-boot-exception-handler with rest controller-postman

## run on postman or directly on client (chrome)
# output

#### localhost:8080/vote/10

{
    "timestamp": {
        "dayOfMonth": 17,
        "dayOfWeek": "TUESDAY",
        "dayOfYear": 260,
        "month": "SEPTEMBER",
        "monthValue": 9,
        "year": 2019,
        "hour": 9,
        "minute": 58,
        "nano": 6000000,
        "second": 12,
        "chronology": {
            "id": "ISO",
            "calendarType": "iso8601"
        }
    },
    "status": 404,
    "error": "Age is not valid for voting for this System..try after some years..!!!"
}

#### localhost:8080/vote/20
    Your age is valid for For this System



