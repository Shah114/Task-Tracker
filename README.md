# 📝 Task Tracker APP (Spring Boot)

A RESTful backend application for managing daily tasks, built using Spring Boot.
This project provides a simple and efficient way to create, update, and track tasks through API endpoints.

---

## 🚀 Features

* ✅ Create new tasks
* 📋 Retrieve all tasks
* 🔍 Get task by ID
* ✏️ Update existing tasks
* ❌ Delete tasks
* ✔️ Mark tasks as completed

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **MySQL / H2 Database**
* **Maven**

---

## 🧱 Project Structure

The project follows a layered architecture:

* **Controller Layer** → Handles HTTP requests
* **Service Layer** → Contains business logic
* **Repository Layer** → Interacts with database
* **Model Layer** → Defines task entity

---

## 📡 API Endpoints

| Method | Endpoint    | Description       |
| ------ | ----------- | ----------------- |
| GET    | /tasks      | Get all tasks     |
| GET    | /tasks/{id} | Get task by ID    |
| POST   | /tasks      | Create a new task |
| PUT    | /tasks/{id} | Update a task     |
| DELETE | /tasks/{id} | Delete a task     |

---

## ▶️ How to Run the Project

1. **Clone the repository**

   ```bash
   git clone https://github.com/Shah114/Task-Tracker.git
   cd Task-Tracker
   ```

2. **Configure database**

   * Update `application.properties` with your database credentials
   * Or use H2 for quick testing

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

4. **Test APIs**

   * Use Postman or any API testing tool
   * Default base URL:

     ```
     http://localhost:8080
     ```

---

## 🧪 Example Request (Create Task)

```json
{
  "title": "Finish project",
  "description": "Complete Spring Boot task app",
  "completed": false
}
```

---

## 📚 What I Learned

* Building RESTful APIs with Spring Boot
* Implementing CRUD operations
* Working with databases using JPA & Hibernate
* Structuring backend applications using layered architecture
* Handling HTTP requests and responses

---

## ⚠️ Note

This project was inspired by a tutorial from YouTube.
I followed the concepts and implementation from the video below and used it as a learning resource to build and understand Spring Boot backend development.

[Spring Boot Task Management App Tutorial](https://youtu.be/brnazVsG4cY?si=nxTB8u3A5wjhimY_)

Additionally, I explored and modified parts of the project to strengthen my understanding of REST APIs, project structure, and backend logic.

---

## 🔮 Future Improvements

* Add task priority (Low, Medium, High)
* Add due dates
* Implement authentication (JWT)
* Add Swagger API documentation
* Build a frontend (React)

---

## 👨‍💻 Author

**Shah**
Aspiring Backend Developer & AI Engineer

---

