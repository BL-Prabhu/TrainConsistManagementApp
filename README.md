# 🚆 Train Consist Management App

A **console-based Java application** that simulates how a railway system manages a train’s consist (collection of bogies).

This project is designed using **industry-standard layered architecture** and demonstrates core Java concepts through real-world scenarios.

---

## 📌 Features

### ✅ UC1: Initialize Train

* Initialize empty train consist
* Display initial bogie count
* Show current train state

### ✅ UC2: Passenger Bogie Management (CRUD)

* Add passenger bogies (Sleeper, AC Chair, First Class)
* Remove bogies dynamically
* Check bogie existence
* Display final train consist

---

## 🧱 Architecture

The project follows a **layered architecture (similar to MVC pattern)**:

```
Main → Controller → Service → Model
```

### 🔹 Layers Explained

* **App Layer** → Entry point of application
* **Controller Layer** → Handles application flow
* **Service Layer** → Contains business logic
* **Model Layer** → Represents data structure
* **Utility Layer** → Common helper methods

---

## 📂 Project Structure

```
com.train
│── app/
│     └── TrainApplication.java
│
│── controller/
│     └── TrainController.java
│
│── service/
│     ├── TrainService.java
│     └── impl/
│           └── TrainServiceImpl.java
│
│── model/
│     └── Train.java
│
│── util/
│     └── ConsolePrinter.java
```

---

## 🛠️ Tech Stack

* Java 8+
* Java Collections Framework (ArrayList)
* OOP Principles
* Clean Code Practices

---

## ▶️ How to Run

### 1. Compile

```bash
javac -d bin src/main/java/com/train/**/*.java
```

### 2. Run

```bash
java -cp bin com.train.app.TrainApplication
```

---

## 💡 Sample Output

```
=== Train Consist Management App ===

UC2 - Add Passenger Bogies to Train

After Adding Bogies:
Passenger Bogies : [Sleeper, AC Chair, First Class]

After Removing 'AC Chair':
Passenger Bogies : [Sleeper, First Class]

Checking if 'Sleeper' exists:
Contains Sleeper? : true

Final Train Passenger Consist:
[Sleeper, First Class]

UC2 operations completed successfully...

System ready for operations...
```

---

## 📚 Key Concepts Covered

* ArrayList (Dynamic collections)
* CRUD Operations (Create, Read, Update, Delete)
* Layered Architecture
* Separation of Concerns
* Method Abstraction
* Clean Coding Standards

---

## 🚀 Future Enhancements

* Implement **Bogie classes using OOP (Inheritance & Polymorphism)**
* Add **Goods bogies with validation rules**
* Introduce **Factory Design Pattern**
* Convert to **Spring Boot REST API**
* Add **Database integration (JPA/Hibernate)**
* Implement **Logging & Exception Handling**

---

## 🌿 Git Workflow

### Branch Naming

```
feature/uc1-train-initialization
feature/uc2-passenger-bogie-crud
```

### Commit Message Format

```
feat: add passenger bogie CRUD operations
refactor: improve service layer structure
chore: setup project structure
```

---

## 👨‍💻 Author

Developed as part of learning **real-world Java application design** with scalable architecture.

---

## ⭐ Conclusion

This project builds a strong foundation for:

* Real-world backend development
* Scalable system design
* Transition to enterprise frameworks like Spring Boot

---
