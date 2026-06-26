# URL Shortener API 🔗

A RESTful URL Shortener built using Java Spring Boot.

This project allows users to generate short URLs, redirect to original URLs, and track click counts using a clean layered architecture.

---

## 🚀 Features

- Generate short URLs using Base62 encoding
- Redirect short URLs to original URLs
- Track URL click counts
- RESTful API design
- Swagger UI for API testing
- H2 in-memory database
- Layered architecture (Controller-Service-Repository)

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Swagger / OpenAPI

---

## 📂 Project Structure

src/main/java/com/parth/urlshortener

├── controller  
├── service  
├── repository  
├── entity  
├── dto  
└── util

---

## ⚡ API Endpoints

### Create Short URL

POST `/api/urls`

Request:

```json
{
  "url": "https://google.com"
}
```

Response:

```json
{
  "id": 1,
  "originalUrl": "https://google.com",
  "shortCode": "b",
  "clickCount": 0
}
```

---

### Redirect URL

GET `/r/{code}`

Example:

```text
http://localhost:8081/r/b
```

Redirects to original URL.

---

## 📘 Swagger Documentation

Open:

```text
http://localhost:8081/swagger-ui/index.html
```

---

## ▶️ Run Locally

Clone repository:

```bash
git clone <repo-url>
```

Run application:

```bash
mvn spring-boot:run
```

---

## 🌟 Future Improvements

- URL expiry support
- PostgreSQL integration
- Docker support
- Custom response DTOs
- Analytics dashboard

---

## 👨‍💻 Author

Parth Mandore
