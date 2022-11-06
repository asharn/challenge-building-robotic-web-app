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
        "is_light_sensing": false,
        "is_sound_sensing": false,
        "is_temperature_sensing": true,
        "is_pressure_sensing": false,
        "is_mobility_degree_of_freedom": false
    },
    "time_stamp": "2022-11-06T20:45:40.875+00:00"
}
```

3. **GET http://localhost:8080/rest/v1/matches/1** Help to fetch matches whose round will be first.
Response:
```
{
    "status_code": 1000,
    "status_message": "Success",
    "data": [
        {
            "id": 1,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 1,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 3,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 3,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        },
        {
            "id": 5,
            "tournament_playing_category": {
                "id": 1,
                "tournament": {
                    "id": 1,
                    "tournament_name": "Inter Team Tournament",
                    "location": "Noida",
                    "start_date": "2021-05-09 18:30:00",
                    "end_date": "2021-05-12 18:30:00",
                    "number_of_rounds": 6,
                    "tournament_type": {
                        "id": 1,
                        "tournamentType": "Team Up"
                    },
                    "surface_type": {
                        "id": 1,
                        "surface_type": "Clay"
                    }
                },
                "playing_category": {
                    "id": 1,
                    "category_name": "Men’s singles"
                }
            },
            "first_registration_id": {
                "id": 2,
                "registration_date": "2021-05-09 18:30:00"
            },
            "second_registration_id": {
                "id": 4,
                "registration_date": "2021-05-09 18:30:00"
            },
            "round": 1
        }
    ],
    "time_stamp": "2021-05-10T13:07:17.690+00:00"
}
```

## TestCase coverage report
Test case coverage report will be found within directory: [test-case-coverage-report](https://github.com/asharn/full-stack-table-tennis-league/blob/main/backend-table-tennis/test-case-coverage-report/index.html)
![image](https://user-images.githubusercontent.com/5220302/117761586-38c73900-b245-11eb-9de4-20fbc17c5822.png)


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
spring.datasource.url=jdbc:mysql://localhost:3306/table_tennis?useSSL=false&tinyInt1isBit=false

```

- **Plugins**
```
 - lombok
```

