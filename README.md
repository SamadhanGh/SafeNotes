
# 🔐 Safe Notes Backend

This repository contains the backend for the **Safe Notes Application**—a secure note-taking web app built using Java, Spring Boot, and PostgreSQL. The project demonstrates robust security practices including JWT authentication, OAuth2 integration, Two-Factor Authentication (2FA), and comprehensive API documentation using Swagger.

## 🚀 Features

- **User Authentication & Authorization:**  
  - JWT-based login system.
  - OAuth2 login with Google & GitHub.
  - Role-based access (User, Admin) for secure operations.

- **Enhanced Security Measures:**  
  - Two-Factor Authentication (2FA) with Google Authenticator.
  - Secure password reset process with expiring tokens.
  - CSRF protection implemented throughout the API.

- **Notes Management:**  
  - CRUD operations for creating, editing, and deleting notes.
  - Rich text editor support for formatting (bold, italics, underline, strikethrough).
  - Audit logs to track all updates and user actions on notes.

- **Admin Dashboard:**  
  - Manage user accounts, update roles, and monitor audit logs.
  - Access control ensuring only authorized admins can perform sensitive actions.

## 🧰 Technologies Used

- **Java 21**  
- **Spring Boot**  
- **Spring Security** (with JWT & OAuth2)  
- **Spring Data JPA**  
- **PostgreSQL**  
- **Swagger/OpenAPI** for API documentation  
- **JavaMailSender** for password reset emails

## 🔧 Getting Started

### Prerequisites

- Java 21 or above
- Maven
- PostgreSQL

### Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/SamadhanGh/SafeNotes.git
   cd SafeNotes
   ```

2. **Configure the Database:**
    
    - Create a PostgreSQL database.
        
    - Update the `application.properties` file with your database credentials and other environment-specific configurations.
        
3. **Run the Application:**
    
    ```bash
    ./mvnw spring-boot:run
    ```
    
4. **Access Swagger UI:**
    
    Once the application is running, you can view the API documentation at:  
    [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
    

## 📂 Folder Structure

```
SafeNotes/
├── src/
│   ├── main/
│   │   ├── java/com/secure/notes/      # Java source code
│   │   │   ├── config/               # Configuration classes
│   │   │   ├── controller/           # REST Controllers
│   │   │   ├── entity/               # JPA Entities
│   │   │   ├── repository/           # Repository interfaces
│   │   │   ├── security/             # Security configurations & filters
│   │   │   └── service/              # Service layer classes
│   │   └── resources/                # Application properties and static files
│   └── test/                         # Test cases
```

## 🔗 API Documentation

The API endpoints are documented with Swagger. Access the documentation at:  
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 👤 Admin Credentials

For demonstration purposes, you can use the following admin credentials to log in:

```
Username: admin
Password: adminPass
```

## 📬 Contact

Made with ❤️ by **Samadhan Ghorpade**  
Feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/samadhan-gh/) and check out more projects on [GitHub](https://github.com/SamadhanGh).

## 📜 License

This project is licensed under the MIT License.

