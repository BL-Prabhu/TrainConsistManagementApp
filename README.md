# UC14: Handle Invalid Bogie Capacity (Custom Exception)

## 📌 Overview

This use case ensures that invalid passenger bogies are never added to the system by enforcing validation rules using a custom exception.

## ❗ Problem

Invalid data such as:

* Zero capacity
* Negative capacity

can corrupt the system and break downstream logic.

## 🎯 Goal

Use a custom exception to prevent creation of invalid bogies.

## ⚙️ Flow

1. User creates a passenger bogie
2. Constructor validates capacity
3. If invalid → throw exception
4. If valid → create bogie
5. System continues safely

## 🧠 Concepts Used

* Custom Exception
* Exception Inheritance
* throw & throws
* Fail-Fast Validation
* Defensive Programming

## ✅ Key Rule

Capacity must be greater than 0

## 📊 Output

Displays error message for invalid bogie and prints valid bogies only.

## 🚀 Benefits

* Prevents bad data entry
* Ensures system reliability
* Stops errors early
* Improves code safety

## 🔥 Conclusion

Always validate input at the object creation stage to avoid future failures.
