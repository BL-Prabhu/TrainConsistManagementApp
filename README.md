# 🚆 Train Consist Management App (UC5)

A **console-based Java application** that simulates how a railway system maintains a train’s consist while ensuring **both uniqueness and insertion order of bogies**.

This use case demonstrates how to use **LinkedHashSet** to model real-world train formation constraints.

---

## 📌 Features

### ✅ UC5: Preserve Insertion Order of Bogies

* Maintain bogies in **exact insertion sequence**
* Prevent **duplicate bogie attachments**
* Automatically enforce **uniqueness**
* Display train formation in **original order**
* No manual validation required for duplicates

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
  * Simulates bogie attachment flow

* **Controller Layer**

  * Handles user actions
  * Delegates logic to service layer

* **Service Layer**

  * Contains business logic
  * Uses LinkedHashSet for operations

* **Model Layer**

  * Represents train data
  * Stores bogies in LinkedHashSet

* **Utility Layer**

  * Handles formatted console output

---

## 📂 Project Structure

```
com.train
│── app/
│     └── TrainApplicationUC5.java
│
│── controller/
│     └── TrainControllerUC5.java
│
│── service/
│     ├── TrainServiceUC5.java
│     └── TrainServiceImplUC5.java
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
* Java Collections Framework (`LinkedHashSet`)
* Object-Oriented Programming (OOP)
* Clean Code Practices

---

## ❗ Problem

Using previous approaches:

* **ArrayList / LinkedList**

  * Allows duplicates ❌
* **HashSet**

  * Removes duplicates ✔
  * Does NOT maintain order ❌

👉 Train systems require:

* No duplicate bogies
* Exact attachment sequence

---

## ✅ Solution

Use **LinkedHashSet**:

* Maintains **insertion order**
* Automatically removes **duplicates**
* Combines benefits of **Set + List**

---

## ⚙️ Operations

### 1. Add Bogies

```
Engine → Sleeper → Cargo → Guard
```

---

### 2. Add Duplicate (Ignored)

```
Sleeper (duplicate)
```

---

### 3. Display Final Formation

```
[Engine, Sleeper, Cargo, Guard]
```

---

## 💡 Sample Output

```
==========================================
 UC5 - Preserve Insertion Order of Bogies
==========================================

Final Train Formation:
[Engine, Sleeper, Cargo, Guard]

Note:
LinkedHashSet preserves insertion order and removes duplicates automatically.

UC5 formation setup completed...
```

---

## 📚 Key Concepts Covered

* LinkedHashSet (Order + Uniqueness)
* Set Interface
* Automatic Deduplication
* Ordered Iteration
* Layered Architecture
* Separation of Concerns

---

## 🔑 Key Requirements Implemented

* Use `LinkedHashSet<String>` for train formation
* Add multiple bogies
* Attempt duplicate insertion
* Ensure duplicates are ignored
* Print final ordered formation

---

## 🚀 Future Enhancements

* Add **user input (Scanner-based menu)**
* Implement **bogie validation rules**
* Introduce **custom Bogie class (equals & hashCode)**
* Convert into **Spring Boot REST API**
* Add **database integration (JPA/Hibernate)**
* Implement **logging and exception handling**

---

## 🌿 Git Workflow

### Branch Naming Convention

```
feature/uc5-linkedhashset-bogie-order
```

---

### Commit Message Format

```
feat: implement bogie uniqueness using LinkedHashSet
feat: preserve insertion order in train formation
refactor: improve service layer abstraction
docs: add README for UC5
```

---

## 👨‍💻 Author

Developed as part of learning **real-world Java backend development** and **data structure-driven system design**.

---

## ⭐ Conclusion

This use case demonstrates how to:

* Maintain **order + uniqueness simultaneously**
* Prevent invalid duplicate entries
* Use **LinkedHashSet in real-world scenarios**

---

🚀 *Next Step:* Combine UC1–UC5 into a unified system and enhance with **OOP modeling + REST APIs + database integration**.
