# Book Management System

A Spring Boot application for managing books and authors with CRUD operations.

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── SST/
│   │           └── Bits/
│   │               ├── controller/
│   │               │   ├── AuthorController.java
│   │               │   └── BookController.java
│   │               ├── model/
│   │               │   ├── Author.java
│   │               │   └── Book.java
│   │               ├── repository/
│   │               │   ├── AuthorRepository.java
│   │               │   └── BookRepository.java
│   │               ├── service/
│   │               │   ├── AuthorService.java
│   │               │   └── BookService.java
│   │               └── BitsApplication.java
│   └── resources/
│       ├── static/
│       │   └── css/
│       │       └── style.css
│       ├── templates/
│       │   ├── authors/
│       │   │   ├── list.jsp
│       │   │   ├── form.jsp
│       │   │   └── books.jsp
│       │   └── books/
│       │       ├── list.jsp
│       │       └── form.jsp
│       └── application.properties
└── test/
    └── java/
        └── com/
            └── SST/
                └── Bits/
                    └── BitsApplicationTests.java
```

## Technologies Used

- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- H2 Database
- JSP
- Bootstrap 5
- Maven

## Features

1. **Author Management**
   - List all authors
   - Add new author
   - Edit existing author
   - View books by author
   - Delete author (with integrity check)

2. **Book Management**
   - List all books
   - Add new book
   - Edit existing book
   - Delete book

3. **Database Features**
   - In-memory H2 database
   - Automatic table creation
   - Sample data population
   - H2 Console access

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd Bits
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Accessing the Application

- Main application: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console
  - JDBC URL: jdbc:h2:mem:testdb
  - Username: sa
  - Password: (leave empty)

## API Endpoints

### Authors

- GET `/authors` - List all authors
- GET `/authors/new` - Show new author form
- POST `/authors` - Create new author
- GET `/authors/{id}/edit` - Show edit author form
- POST `/authors/{id}` - Update author
- GET `/authors/{id}/books` - View books by author
- POST `/authors/{id}/delete` - Delete author

### Books

- GET `/books` - List all books
- GET `/books/new` - Show new book form
- POST `/books` - Create new book
- GET `/books/{id}/edit` - Show edit book form
- POST `/books/{id}` - Update book
- POST `/books/{id}/delete` - Delete book

## Database Schema

### Author Table
```sql
CREATE TABLE author (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);
```

### Book Table
```sql
CREATE TABLE book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(13) UNIQUE NOT NULL,
    author_id BIGINT,
    FOREIGN KEY (author_id) REFERENCES author(id)
);
```

## Sample Data

The application comes pre-populated with:
- 5 sample authors
- 10 sample books

## Error Handling

The application includes comprehensive error handling for:
- Data integrity violations
- Invalid form submissions
- Not found resources
- Database constraints


## License

This project is licensed under the MIT License - see the LICENSE file for details. 