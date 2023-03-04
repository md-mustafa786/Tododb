# Tododb
* This project store the data of user managment system 
## Framwork and Language use in this Project
* Springboot 
* java
## Dependencies
* Spring Web
* h2 Database
* hibernate
* lombok

## Flow of project
* Create three layers model , service , controller, repository.
* In model layer create one class Todo.
* In controller layer to performe CRUD operatiom by http request.
* In service layer write a business logic of CRUD operation.
* In repository layer exteds JPARepository.
## Constraints:
* Todo model will have-
* Id
* Title
* Status

## Endpoints to provided :
* /add-todo
* update user by userId
* delete user
* Get all user
* Get user by Id
