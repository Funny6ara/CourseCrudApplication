# CourseCrudApplication
Course CRUD Application (Spring Boot)

A simple Course Management CRUD Application built using Spring Boot, Spring Data JPA, REST APIs, and a basic HTML frontend.

This project allows users to Create, Read, Update, and Delete (CRUD) course details.

🚀 Features

Add a new course

View all courses

Update existing course

Delete a course

RESTful API design

Simple frontend using HTML

Uses Maven for dependency management

🛠️ Technologies Used

Java

Spring Boot

Spring Web

Spring Data JPA

Maven

HTML

Embedded Tomcat Server

📂 Project Structure
coursecrud
│
├── pom.xml
├── mvnw / mvnw.cmd
├── src
│   ├── main
│   │   ├── java/com/example/coursecrud
│   │   │   ├── Course.java
│   │   │   ├── CourseController.java
│   │   │   ├── CourseRepository.java
│   │   │   └── CoursecrudApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── static/index.html
│   │
│   └── test
│       └── java/com/example/coursecrud
│           └── CoursecrudApplicationTests.java
│
└── README.md

📄 File Description
Course.java

Entity class

Represents Course table

Contains fields like id, name, etc.

CourseRepository.java

Interface extending JpaRepository

Handles database operations

CourseController.java

REST Controller

Defines APIs for CRUD operations

CoursecrudApplication.java

Main Spring Boot application class

Starts the application

application.properties

Configuration file

Server and database settings

index.html

Simple frontend UI

Interacts with backend APIs

🔗 REST API Endpoints
Method	Endpoint	Description
GET	/courses	Get all courses
POST	/courses	Add new course
PUT	/courses/{id}	Update course
DELETE	/courses/{id}	Delete course
▶️ How to Run the Project
Step 1: Open Project

Open the project in IntelliJ IDEA / Eclipse

Step 2: Run Application
mvn spring-boot:run


OR
Run CoursecrudApplication.java directly

Step 3: Open Browser
http://localhost:8080

🧪 Testing

Backend APIs tested using browser / Postman

Unit test class available in:
