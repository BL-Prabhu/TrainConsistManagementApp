# 🚆 Railway Bogie & Quantity Measurement System

## 📘 Complete README (Use Cases 1–20)

---

## 📌 Project Overview

This project simulates a **Railway Bogie Management & Quantity Measurement System**. It demonstrates core programming concepts such as:

* Object-Oriented Programming
* API Development (Spring Boot)
* Searching & Sorting Algorithms
* Exception Handling
* Data Processing & Validation

The system evolves across multiple use cases, gradually introducing complexity and real-world problem-solving.

---

# 🧩 USE CASES SUMMARY

---

## 🔹 UC1 – UC5: Basic Setup & Data Representation

### Goal

Introduce basic structure for handling bogie and quantity data.

### Concepts

* Classes & Objects
* Data storage
* Basic input/output

---

## 🔹 UC6 – UC10: Quantity Measurement Operations

### Goal

Perform operations like:

* Comparison
* Addition

### Concepts

* DTOs (Data Transfer Objects)
* Service Layer
* Unit Conversion

---

## 🔹 UC11 – UC14: API Development (Spring Boot)

### Goal

Expose REST APIs for operations.

### Features

* Compare Quantities
* Add Quantities
* JSON request/response

### Concepts

* REST Controller
* MockMvc Testing
* Layered Architecture

---

## 🔹 UC15 – UC17: Sorting & Reporting

### Goal

Organize bogie data for reporting.

### Features

* Sorting bogie IDs
* Operation tracking
* Operation count

### Concepts

* Sorting Algorithms
* Data Aggregation
* Reporting logic

---

# 🔍 UC18: Linear Search for Bogie ID

## ❗ Problem

System cannot locate a specific bogie in an unsorted list.

## 🎯 Goal

Search bogie using **Linear Search**.

## 🔄 Flow

1. User provides bogie list
2. User enters search ID
3. System checks each element sequentially
4. Stops when match found
5. Displays result

## 🧠 Concepts

* Linear Search (O(n))
* Sequential Traversal
* equals() for comparison
* Early termination

## ✅ Benefits

* Works on unsorted data
* Simple implementation
* Foundation for searching

---

# ⚡ UC19: Binary Search for Bogie ID

## ❗ Problem

Linear search is slow for large datasets.

## 🎯 Goal

Use **Binary Search** for faster lookup.

## 🔄 Flow

1. Data must be sorted
2. Initialize low & high
3. Find mid index
4. Compare using compareTo()
5. Narrow search range
6. Repeat until found

## 🧠 Concepts

* Binary Search (O(log n))
* Divide & Conquer
* Sorted data requirement
* Index-based traversal

## ✅ Benefits

* Much faster search
* Scales to large datasets
* Efficient lookup

---

# 🛑 UC20: Exception Handling in Search

## ❗ Problem

Search runs even when no bogies exist.

## 🎯 Goal

Prevent invalid operations using exceptions.

## 🔄 Flow

1. User triggers search
2. System checks if data exists
3. If empty → throw exception
4. Stop execution
5. Show meaningful error

## 🧠 Concepts

* Defensive Programming
* IllegalStateException
* Fail-Fast Principle
* State Validation

## ✅ Benefits

* Prevents invalid logic
* Improves reliability
* Cleaner error handling

---

# 🏗️ SYSTEM ARCHITECTURE

```
Controller → Service → Repository → Data
```

### Layers:

* **Controller** → Handles API requests
* **Service** → Business logic
* **Repository** → Data operations
* **DTOs** → Data transfer

---

# 🔗 SAMPLE APIs

### Compare Quantities

```
POST /api/v1/quantities/compare
```

### Add Quantities

```
POST /api/v1/quantities/add
```

### Get Operation History

```
GET /api/v1/quantities/history/operation/{operation}
```

### Get Operation Count

```
GET /api/v1/quantities/count/{operation}
```

---

# 🧪 TESTING

* JUnit 5
* Mockito
* MockMvc

### Example:

* Controller tests
* Service mocking
* API validation

---

# ⚙️ KEY LEARNINGS

✔ Data structures (arrays, lists)
✔ Searching algorithms (Linear, Binary)
✔ Sorting techniques
✔ REST API development
✔ Exception handling
✔ Clean architecture principles

---

# 🚀 FINAL OUTCOME

By UC20, the system supports:

✅ Data storage & processing
✅ REST APIs
✅ Sorting & reporting
✅ Linear & Binary Search
✅ Exception-safe operations

---

# 📈 FUTURE ENHANCEMENTS

* Database integration (MySQL)
* Pagination for large datasets
* Advanced filtering
* UI dashboard
* Performance optimization

---

# 🏁 CONCLUSION

This project evolves from basic programming concepts to **real-world system design**, combining:

* Algorithms
* Backend development
* Robust error handling

It provides a strong foundation for building scalable enterprise applications.

---

## 👨‍💻 Author

Developed as part of learning and implementing structured software design and problem-solving techniques.

---
