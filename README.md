# Employee Management System

A simple RESTful CRUD API application built with **Spring Boot** and **MySQL** for managing employee data. Designed to demonstrate backend development skills including Java, Spring Data JPA, REST APIs, and database integration.

---

## Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Setup and Installation](#setup-and-installation)
- [Testing the API](#testing-the-api)
- [Contributing](#contributing)
- [Author](#author)
- [License](#license)

---

## About the Project

This project implements a basic employee management system with CRUD operations:

- Create new employee records  
- Retrieve all or individual employee data  
- Update employee information  
- Delete employee records  

It serves as a practical example of building a backend API with Spring Boot, demonstrating REST principles, database connectivity, and proper project structuring.

---

## Features

- RESTful API with Spring Boot  
- Data persistence using Spring Data JPA and MySQL  
- Automatic database schema update with Hibernate  
- Clean API design with separate layers for Controller, Service, and Repository  
- Swagger UI integration for API documentation and testing  

---

## Technologies Used

- Java 21  
- Spring Boot 3.x  
- Spring Data JPA  
- MySQL 8.x  
- Hibernate ORM  
- Maven for build and dependency management  
- VS Code as the development environment  
- Postman and Swagger UI for API testing  

---

## Getting Started

### Prerequisites

- Java JDK 21 or higher  
- MySQL installed and running  
- Maven installed  
- Git installed  
- IDE like VS Code  

---

## API Endpoints

| Method | Endpoint                   | Description                   |
|--------|----------------------------|-------------------------------|
| POST   | `/employees/add`            | Add a new employee            |
| GET    | `/employees/all`            | Get all employees             |
| GET    | `/employees/{id}`           | Get employee by ID            |
| PUT    | `/employees/update/{id}`    | Update employee details       |
| DELETE | `/employees/delete/{id}`    | Delete employee by ID         |

---

## Setup and Installation

1. Clone the repository:
git clone https://github.com/keshavsoni166/employee_management.git

text
2. Navigate to the project directory:
cd employee_management

text
3. Configure your MySQL credentials in `src/main/resources/application.properties`
4. Build and run the project:
mvn spring-boot:run

text
5. Access the API at `http://localhost:8080`

---

## Testing the API

- Use Postman or Swagger UI to test and explore API endpoints  
- Swagger UI available at:  
`http://localhost:8080/swagger-ui/index.html`  

---

## Contributing

Contributions are welcome! Please fork the repo and create a pull request with your enhancements or bug fixes.

---

## Author

**Keshav Soni**  
Backend developer | Java | Spring Boot | MySQL  
[LinkedIn](https://www.linkedin.com/in/keshav-soni-30687b1a7/) | [GitHub](https://github.com/keshavsoni166)  

---