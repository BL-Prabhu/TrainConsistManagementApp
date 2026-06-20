# 🚆 Train Consist Management App (UC6)

A **console-based Java application** that simulates how a railway system maps each bogie to its **seating or load capacity** using a key–value structure.

This use case introduces **HashMap** to represent real-world relationships between bogies and their attributes.

---

## 📌 Features

### ✅ UC6: Map Bogie to Capacity

* Associate each bogie with its **capacity**
* Store data using **key–value mapping**
* Display bogie and capacity together
* Enable fast lookup using bogie name

---

## 🧱 Architecture

```
Main → Controller → Service → Model → Utility
```

---

## 📂 Project Structure

```
com.train
│── app/
│     └── TrainApplicationUC6.java
│
│── controller/
│     └── TrainControllerUC6.java
│
│── service/
│     ├── TrainServiceUC6.java
│     └── TrainServiceImplUC6.java
│
│── model/
│     └── TrainUC6.java
│
│── util/
│     └── ConsolePrinter.java
```

---

## 🛠️ Tech Stack

* Java 8+
* Java Collections Framework (`HashMap`)
* OOP Principles
* Clean Architecture

---

## ❗ Problem

Previous use cases:

* Stored only bogie names ❌
* No way to store capacity ❌
* No real-world attribute mapping ❌

---

## ✅ Solution

Use **HashMap<String, Integer>**

* Key → Bogie Name
* Value → Capacity

---

## ⚙️ Operations

### 1. Add Mapping

```
Sleeper → 72
AC Chair → 60
First Class → 24
```

---

### 2. Display Mapping

```
Sleeper -> Capacity: 72
AC Chair -> Capacity: 60
First Class -> Capacity: 24
```

---

## 📚 Key Concepts Covered

* HashMap
* Key–Value Pair Mapping
* entrySet() Iteration
* Fast Lookup
* Data Modeling

---

## 🔑 Key Requirements

* Use `HashMap<String, Integer>`
* Insert bogie-capacity pairs
* Iterate using `entrySet()`
* Display output clearly

---

## 🚀 Future Enhancements

* Add validation rules for capacity
* Introduce Bogie class (OOP)
* Convert into REST API (Spring Boot)
* Add database (JPA/Hibernate)

---

## 🌿 Git Workflow

### Branch

```
feature/uc6-hashmap-bogie-capacity
```

### Commits

```
feat: implement hashmap mapping for bogies
docs: add UC6 readme
```

---

## ⭐ Conclusion

This use case demonstrates how to:

* Model real-world relationships using HashMap
* Store and retrieve structured data efficiently
* Build foundation for analytics and validation

---

🚀 *Next Step:* Extend with **custom objects + database integration**
