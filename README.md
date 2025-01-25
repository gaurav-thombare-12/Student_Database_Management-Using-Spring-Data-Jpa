# Student Database Management System

## Overview
This project is a **Student Database Management System** built using:
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**

The application provides CRUD operations for managing student records, such as adding, updating, retrieving, and deleting student data. The backend is implemented using Spring Boot, while MySQL is used as the database.

---

## Features

1. **Add a Student**
   - Store a new student record in the database.
   - API Endpoint: `POST /api/sdm/save`

2. **View All Students**
   - Retrieve a list of all students from the database.
   - API Endpoint: `GET /api/sdm/all`

3. **View a Specific Student**
   - Retrieve the details of a single student by ID.
   - API Endpoints:  
     - `GET /api/sdm/{id}` (using `@PathVariable`)
     - `GET /api/sdm` (using `@RequestParam`)

4. **Update Student Details (All Fields)**
   - Update all details of a student by their ID.
   - API Endpoint: `PUT /api/sdm/{id}`

5. **Update Specific Fields of a Student**
   - Update only the specified fields of a student.
   - API Endpoint: `PATCH /api/sdm/{id}`

6. **Delete a Student by ID**
   - Remove a student record from the database using their ID.
   - API Endpoint: `DELETE /api/sdm/{id}`

7. **Delete All Students**
   - Remove all student records from the database.
   - API Endpoint: `DELETE /api/sdm`

---

## Setup Instructions

### Prerequisites
- **Java JDK** (version 11 or higher)
- **MySQL Server**
- **Maven**
- IDE (e.g., IntelliJ IDEA with Spring Initializer plugin)
- **Postman** (for testing APIs)

### Steps to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo-url.git
   ```

2. Open the project in your IDE.

3. Add the required dependencies:
   - Spring Web
   - Spring Data JPA
   - MySQL Connector

4. Configure the database in `application.properties`:
   ```properties
   spring.application.name=Student_Database_Management-Using-Spring-Data-Jpa

   # Database configuration
   spring.jpa.hibernate.ddl-auto=update

   spring.datasource.url=jdbc:mysql://localhost:3306/StudentManagement
   spring.datasource.username=root
   spring.datasource.password=root
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.show-sql=true

   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   ```

5. Create the database in MySQL:
   ```sql
   CREATE DATABASE StudentManagement;
   ```

6. Run the application:
   ```bash
   mvn spring-boot:run
   ```

7. Test the APIs using Postman or any API testing tool.

---

## API Endpoints

| Method | Endpoint             | Description                          |
|--------|----------------------|--------------------------------------|
| POST   | `/api/sdm/save`      | Add a new student                   |
| GET    | `/api/sdm/all`       | View all students                   |
| GET    | `/api/sdm/{id}`      | View a student by ID (PathVariable) |
| GET    | `/api/sdm`           | View a student by ID (RequestParam) |
| PUT    | `/api/sdm/{id}`      | Update all details of a student     |
| PATCH  | `/api/sdm/{id}`      | Update specific fields of a student |
| DELETE | `/api/sdm/{id}`      | Delete a student by ID              |
| DELETE | `/api/sdm`           | Delete all students                 |

---

## How It Works

1. **Database Setup**:
   - JPA creates the `students` table automatically based on the `Student` entity class.

2. **Controller Layer**:
   - Handles API requests and responses.

3. **Service Layer**:
   - Contains the business logic for handling student data.

4. **Repository Layer**:
   - Uses Spring Data JPA to interact with the database.

---

## Testing the Application

1. Use Postman to test the APIs.
2. Example SQL commands to verify data in the database:
   ```sql
   USE StudentManagement;
   SELECT * FROM students;
   ```

---

## Notes

- **Improvements**:
  - Add validation for input fields.
  - Handle exceptions for better error responses.
  - Add pagination and sorting for the `/all` endpoint.
  - Include Swagger for API documentation.

- **Learning Purpose**: This is a basic project to understand Spring Boot and JPA. Contributions and suggestions are welcome!

---

## Author
**Gaurav Thombare**  
- **Email**: [thombaregaurav768@gmail.com](mailto:thombaregaurav768@gmail.com)  
- **LinkedIn**: [linkedin.com/in/gauravthombare0102](https://www.linkedin.com/in/gauravthombare0102/)  

Feel free to connect for suggestions and improvements!

