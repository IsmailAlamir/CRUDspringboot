# Parking App

### Routes:
* get/post methods : http://localhost:8080/subjects
* update/delete methods : http://localhost:8080/subjects/{id}

## The Database
* start the sql server
* type **psql**
* **CREATE DATABASE locator;** create the database.
* **\c locator;** To connect to the database
* **\d** to check if the table created it will be **locator** table.
* After adding parking to the table you can see the table content **SELECT * FROM parking;**

## The application.properties File
```
server.port=8080  
spring.datasource.platform=postgres  
spring.datasource.url=jdbc:postgresql://localhost:5432/subject
spring.datasource.username=ismail  
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update  
spring.datasource.initialization-mode=always  
```