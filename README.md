# 🚆 Train Consist Management App

A **console-based Java application** that simulates how a railway system manages a train’s consist (collection of bogies).

This project is built using **industry-standard layered architecture** and demonstrates core Java concepts through real-world use cases.

---

## 📌 Features

### ✅ UC1: Initialize Train

* Create an empty train consist
* Display initial bogie count
* Show current train state

---

### ✅ UC2: Passenger Bogie Management (CRUD)

* Add passenger bogies (Sleeper, AC Chair, First Class)
* Remove bogies dynamically
* Check if a bogie exists
* Display updated train consist

---

### ✅ UC3: Track Unique Bogie IDs

* Store bogie IDs using `HashSet`
* Automatically remove duplicate entries
* Ensure uniqueness of bogies
* Demonstrate real-world validation logic

---

## 🧱 Architecture

This project follows a **Layered Architecture (similar to MVC pattern)**:

```
Main → Controller → Service → Model → Utility
```

---

### 🔹 Layers Explained

* **App Layer**

    * Entry point of the application
    * Initializes and starts execution

* **Controller Layer**

    * Handles application flow
    * Delegates tasks to service layer

* **Service Layer**

    * Contains business logic
    * Implements core functionalities

* **Model Layer**

    * Represents data structures (Train, Bogie)

* **Utility Layer**

    * Provides reusable helper methods
    * Handles console outputs and formatting

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
* Java Collections Framework (`ArrayList`, `HashSet`)
* Object-Oriented Programming (OOP)
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

UC3 - Track Unique Bogie IDs

Bogie IDs After Insertion:
[BG101, BG102, BG103]

Note:
Duplicates are automatically ignored by HashSet.

UC3 uniqueness validation completed...

System ready for operations...
```

---

## 📚 Key Concepts Covered

* ArrayList (Dynamic Data Structure)
* HashSet (Uniqueness & Hashing)
* CRUD Operations
* Layered Architecture
* Separation of Concerns
* Abstraction & Encapsulation
* Clean Coding Standards

---

## 🚀 Future Enhancements

* Implement **Bogie classes using OOP (Inheritance & Polymorphism)**
* Add **Goods bogies with validation rules**
* Introduce **Factory Design Pattern**
* Convert application into **Spring Boot REST API**
* Add **Database integration (JPA / Hibernate)**
* Implement **Logging & Global Exception Handling**

---

## 🌿 Git Workflow

### Branch Naming Convention

```
feature/uc1-train-initialization
feature/uc2-passenger-bogie-crud
feature/uc3-unique-bogie-ids
```

---

### Commit Message Format

```
feat: add unique bogie tracking using HashSet
refactor: improve service layer structure
chore: setup project architecture
docs: update README with UC3
```

---

## 👨‍💻 Author

Developed as part of learning **real-world Java backend development** and **scalable system design principles**.

---

## ⭐ Conclusion

This project provides a strong foundation for:

* Real-world backend development
* Scalable application architecture
* Transition to enterprise frameworks like Spring Boot

---

🚀 *Next Step:* Extend this project with **object-based uniqueness (equals & hashCode)** and convert it into a **production-ready REST API**.
