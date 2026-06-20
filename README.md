# UC7 - Sort Bogies by Capacity (Comparator)

## 📌 Overview
This use case demonstrates sorting of passenger bogies based on seating capacity using Java Comparator.

## ❗ Problem in UC6
- Data stored using HashMap
- No ordering
- Difficult for planning and analysis

## 🎯 Objective
Sort bogies based on seating capacity to enable better decision-making.

## 🛠️ Technologies Used
- Java
- OOP (Model, Service, Controller)
- Collections (List)
- Comparator
- Lambda Expressions

## 📂 Project Structure
model/
service/
controller/
app/

## ▶️ Flow
1. Create Bogie objects
2. Store in List
3. Apply Comparator sorting
4. Display results

## 📊 Sample Output

Ascending Order:
First Class (24)
AC Chair (56)
Sleeper (72)
General (90)

Descending Order:
General (90)
Sleeper (72)
AC Chair (56)
First Class (24)

## 🚀 Key Concepts
- Comparator.comparingInt()
- Custom object sorting
- Separation of concerns

## ✅ Benefits
- Enables ranking of bogies
- Improves planning
- Clean and maintainable design