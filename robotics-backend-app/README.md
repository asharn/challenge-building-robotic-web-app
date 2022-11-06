# Robot backend application

## Documents illustration with different Rest API involving table robot
1. **GET http://localhost:8080/rest/v1/robot**
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": [
        {
            "id": 1,
            "name": "Scrap",
            "build_at": "2022-11-05 18:30:00",
            "updated_at": "2022-11-05 18:30:00",
            "mass": 20,
            "color": "Red",
            "state": "DESIGNED",
            "is_light_sensing": false,
            "is_sound_sensing": true,
            "is_temperature_sensing": false,
            "is_pressure_sensing": true,
            "is_mobility_degree_of_freedom": false
        },
        {
            "id": 2,
            "name": "Sparkles",
            "build_at": "2022-11-04 18:30:00",
            "updated_at": "2022-11-05 18:30:00",
            "mass": 23,
            "color": "Blue",
            "state": "DESIGNED",
            "is_light_sensing": false,
            "is_sound_sensing": false,
            "is_temperature_sensing": true,
            "is_pressure_sensing": false,
            "is_mobility_degree_of_freedom": false
        },
        {
            "id": 3,
            "name": "Radion",
            "build_at": "2022-11-03 18:30:00",
            "updated_at": "2022-11-04 18:30:00",
            "mass": 18,
            "color": "Pink",
            "state": "DEPLOYED",
            "is_light_sensing": false,
            "is_sound_sensing": false,
            "is_temperature_sensing": true,
            "is_pressure_sensing": false,
            "is_mobility_degree_of_freedom": false
        },
    ],
    "time_stamp": "2022-11-06T20:44:42.381+00:00"
}

```

2. **GET http://localhost:8080/rest/v1/robot/2** Help to fetch single robot details.
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": {
        "id": 2,
        "name": "Sparkles",
        "build_at": "2022-11-04 18:30:00",
        "updated_at": "2022-11-05 18:30:00",
        "mass": 23,
        "color": "Blue",
        "state": "DESIGNED",
        "is_light_sensing": false,
        "is_sound_sensing": false,
        "is_temperature_sensing": true,
        "is_pressure_sensing": false,
        "is_mobility_degree_of_freedom": false
    },
    "time_stamp": "2022-11-06T20:45:40.875+00:00"
}
```

3. **POST http://localhost:8080/rest/v1/robot** Help to add new robot in the application.
   Response:
```
{
    "name": "Sparkles 3",
    "mass": 24,
    "color": "Blue",
    "state": "DESIGNED",
    "is_light_sensing": false,
    "is_sound_sensing": false,
    "is_temperature_sensing": true,
    "is_pressure_sensing": true,
    "is_mobility_degree_of_freedom": false
}
```
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": {
        "id": 9,
        "name": "Sparkles 3",
        "build_at": "2022-11-06 21:04:06",
        "updated_at": "2022-11-06 21:04:06",
        "mass": 24,
        "color": "Blue",
        "state": "DESIGNED",
        "is_light_sensing": false,
        "is_sound_sensing": false,
        "is_temperature_sensing": true,
        "is_pressure_sensing": true,
        "is_mobility_degree_of_freedom": false
    },
    "time_stamp": "2022-11-06T21:04:06.045+00:00"
}
```

4**PUT http://localhost:8080/rest/v1/robot/4** Help to update existing robot in the application.
   Request:
```
{
        {
    "id": 9,
    "name": "Sparkles 3",
    "mass": 24,
    "color": "Blue",
    "state": "DEPLOYED",
    "is_light_sensing": true,
    "is_sound_sensing": false,
    "is_temperature_sensing": true,
    "is_pressure_sensing": true,
    "is_mobility_degree_of_freedom": false
}
```
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": {
        "id": 9,
        "name": "Sparkles 3",
        "build_at": "2022-11-06 18:30:00",
        "updated_at": "2022-11-06 21:17:38",
        "mass": 24,
        "color": "Blue",
        "state": "DEPLOYED",
        "is_light_sensing": true,
        "is_sound_sensing": false,
        "is_temperature_sensing": true,
        "is_pressure_sensing": true,
        "is_mobility_degree_of_freedom": false
    },
    "time_stamp": "2022-11-06T21:17:37.798+00:00"
}
```


5**GET http://localhost:8080/rest/v1/robot/2** Help to delete single robot from the application.
   Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": "Robot deleted successfully.",
    "time_stamp": "2022-11-06T21:22:46.642+00:00"
}
```

## TestCase coverage report
Test case coverage report will be found within directory: [test-case-coverage-report]


## External Resources
- [Building a RESTful service in Spring Boot](http://spring.io/guides/gs/rest-service/)
- [Testing in Spring Boot](https://www.baeldung.com/spring-boot-testing)
- [Logging in SprintBoot](https://www.baeldung.com/spring-boot-logging)
- [Creating a Multi Module Project](https://spring.io/guides/gs/multi-module/)

## Application execution in IntelliJ
Setting:-
- **Build, Execution, Deployment -> Compiler -> Shared build process VM options**
     ```
     -Djps.track.ap.dependencies=false
     ``` 
     
- **To connect to MySql, URL need to have these dependencies**
```
spring.datasource.url=jdbc:mysql://localhost:3306/robotic?useSSL=false&tinyInt1isBit=false

```

- **Plugins**
```
 - lombok
```

