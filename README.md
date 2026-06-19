# 🚆 Train Consist Management App (UC4)

A **console-based Java application** that simulates how a railway system maintains the **ordered sequence of train bogies**.

This use case focuses on **preserving order and performing position-based operations** using `LinkedList`.

---

## 📌 Features

### ✅ UC4: Maintain Ordered Bogie Consist

* Maintain train bogies in a **specific sequence**
* Insert bogies at a **particular position**
* Remove bogies from **front and rear**
* Ensure **order is always preserved**
* Perform efficient **dynamic operations**

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
  * Executes UC4 operations step-by-step

* **Controller Layer**

  * Handles flow of operations
  * Delegates tasks to service layer

* **Service Layer**

  * Contains business logic
  * Performs LinkedList operations

* **Model Layer**

  * Represents Train data
  * Stores bogies using LinkedList

* **Utility Layer**

  * Handles formatted console output

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
│     └── TrainServiceImpl.java
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
* Java Collections Framework (`LinkedList`)
* Object-Oriented Programming (OOP)
* Clean Code Practices

---

## ❗ Problem

Previous approaches:

* `ArrayList` → maintains order but inefficient for insert/remove in middle
* `HashSet` → removes duplicates but **does NOT maintain order**

👉 Train systems require **strict sequence maintenance**

---

## ✅ Solution

Use **LinkedList** to:

* Maintain insertion order
* Allow fast insertions at any position
* Efficiently remove from beginning and end

---

## ⚙️ Operations

### 1. Initialize Train

```
Engine → Sleeper → AC → Cargo → Guard
```

---

### 2. Insert Bogie

```
Insert "Pantry Car" at position 2
```

---

### 3. Remove Bogies

* Remove first bogie
* Remove last bogie

---

## 💡 Sample Output

```
======================================
UC4 - Maintain Ordered Bogie Consist
======================================

Initial Train Consist:
[Engine, Sleeper, AC, Cargo, Guard]

After Inserting 'Pantry Car' at position 2:
[Engine, Sleeper, Pantry Car, AC, Cargo, Guard]

After Removing First and Last Bogie:
[Sleeper, Pantry Car, AC, Cargo]

UC4 ordered consist operations completed...
```

---

## 📚 Key Concepts Covered

* LinkedList (Doubly Linked List)
* Position-based insertion (`add(index, element)`)
* Deletion operations (`removeFirst`, `removeLast`)
* Layered Architecture
* Separation of Concerns
* Clean Coding Standards

---

## 🚀 Future Enhancements

* Add **menu-driven user input (Scanner)**
* Implement **exception handling for invalid index**
* Add **logging (Log4j / SLF4J)**
* Introduce **Bogie classes with inheritance**
* Convert into **Spring Boot REST API**
* Integrate **database (JPA / Hibernate)**

---

## 🌿 Git Workflow

### Branch Naming Convention

```
feature/uc4-ordered-bogie-management
```

---

### Commit Message Format

```
feat: implement ordered bogie management using LinkedList
feat: add insert and remove operations
refactor: improve service layer logic
docs: add README for UC4
```

---

## 👨‍💻 Author

Developed as part of learning **real-world Java backend development** and **data structure applications in system design**.

---

## ⭐ Conclusion

This use case demonstrates how to:

* Maintain strict order in dynamic systems
* Perform efficient modifications
* Apply LinkedList in real-world scenarios

---

🚀 *Next Step:* Combine UC1–UC4 into a unified system and enhance with **OOP design + REST APIs**.
