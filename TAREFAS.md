### Endpoints (Tarefas 1, 2 e 3)

GET /register/student

200 Response Body
[
    {
        "name": "leo",
        "age": 23,
        "registrationNumber": "20204008"
    }
]

POST /register/student

Request Body
{
    "name":"leo",
    "age":23,
    "registrationNumber":"20204008"
}

200 Response Body
{
    "name": "leo",
    "age": 23,
    "registrationNumber": "20204008",
    "registrationStatus": "Successful"
}

DELETE /delete/student/{regdNum}

Request
Path Variable String regdNum

200 Response Body "Delete successful" or 200 "Delete un-successful"

PUT /update/student

Request Body
{
    "name":"leonardo",
    "age":23,
    "registrationNumber":"20204008"
}

200 Response Body "Update un-successful" or 200 "Update successful"

