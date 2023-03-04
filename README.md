# Tododb
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run Application
 * Download the source code and import in intellijIDEA.
 * Go to localhost:8080/
 * Type endpoints 
 * If need then provide RequestBody in json format and Path-variable or path-param.
 
 User will perform following operations - 
 ##### 1) - Add Todo Info -
 In AddTodo functionality we Post User info through Postman and it gets added to the User list - 
 ##### -> Add Todo EndPoints:
       * Home - localhost:8080/
       * Endpoint -/add-todo

 
 ##### 2) - Get a Todo Info by Id -
 In this functionality we provide a perticular Todo info by sending the id in url through @Pathvariable - 
  ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /find-todo/id/{id}
 
 
 
 ##### 3) - Get all Todo Info -
 This functionality provides all Todo info list - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - /find-all
 
 
 ##### 4) - Update Todo Info by Id-
 This functionality Updates a perticular Todo info through Postman by sending id in url through @Pathvariable - 
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint - update-todo/id/{id}
 
 

 ##### 5) - Delete Todo Info by Id-
 This functionality delete particular Todo info through Postman using the Delete method by sending the Todo-id in URL through @Pathvariable -
 ##### -> EndPoints:
       * Home - localhost:8080/
       * Endpoint -delete-todo/id/{id}
 


### Note
* You can change server port by application.properties file i.e.

        server.port=8081
 
