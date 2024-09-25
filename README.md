# Employee Management System

## Description
A simple Spring Boot application that demonstrates the core functionalities of an employee management system, built from scratch using Spring Boot 3, Spring MVC, Spring Security 6, Thymeleaf, and PostgreSQL. This project focuses solely on the backend and frontend, showcasing key Spring Boot features like dependency injection, JPA for database management, and RESTful APIs.

## Features
- List Employees
- Add Employee
- Update Employee
- Delete Employee
- Pagination
- Sorting
- User Login
- User Registration
- User Logout

## Architecture: MVC (Model-View-Controller)
The application follows the **MVC (Model-View-Controller)** architecture, ensuring a clear separation of concerns. This structure helps in keeping the code organized, maintainable, and scalable by dividing the application into three interconnected components: the model, the view, and the controller.

## Technologies Used
- **Spring Boot 3**: For application setup and framework support.
- **Java JDK 17+**: For language support.
- **Spring Data JPA (Hibernate)**: For ORM and database interactions.
- **Spring Security 6**: For securing the application.
- **PostgreSQL**: For data persistence.
- **Thymeleaf**: For rendering HTML templates.
- **Maven**: For managing dependencies and building the project.
- **IntelliJ**: As the integrated development environment (IDE).
- **Tomcat**: For deploying the application.

## API Endpoints
- **User Management**:
  - `POST /api/registration`: Create a new user.
  - `POST /api/login`: Authenticate an existing user.
  - `POST /api/logout`: Log out the current user.
- **Employee Management**:
  - `POST /api/saveEmployee`: Add a new employee.
  - `GET /api/employees`: Fetch all employees.
  - `GET /api/showFormForUpdate/{id}`: form for update.
  - `PUT /api/employees/{id}`: Update an existing employee.
  - `DELETE /api/deleteEmployee/{id}`: Delete an employee by ID.

## Testing
**Postman** was used for testing the API endpoints. The application was tested by sending various HTTP requests (GET, POST, PUT, DELETE) to verify the correct implementation of the functionality.
