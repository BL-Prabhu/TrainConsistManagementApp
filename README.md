# UC11 - Validate Train ID & Cargo Codes (Regex)

## 📌 Overview

This use case introduces input validation using Regular Expressions (Regex) to ensure that Train IDs and Cargo Codes follow strict business formats before processing.

## ❗ Problem Statement

Previous use cases assume all input data is valid. In real-world systems, invalid inputs can:

* Break data integrity
* Cause processing failures
* Generate incorrect reports

## 🎯 Objective

Validate:

* Train ID → Format: TRN-1234
* Cargo Code → Format: PET-AB

## 🔧 Technologies Used

* Java
* Regex (Regular Expressions)
* Pattern & Matcher Classes

## ▶️ Flow

1. User enters Train ID and Cargo Code
2. System compiles regex patterns
3. Matcher validates input
4. Displays VALID / INVALID result

## 📊 Sample Output

Train ID is VALID: TRN-1234
Cargo Code is VALID: PET-AB

Train ID is INVALID: TRAIN12
Cargo Code is INVALID: PET-123

## 🧠 Key Concepts

* Pattern.compile()
* matcher().matches()
* Regex format enforcement

## ✅ Benefits

* Prevents invalid input
* Ensures data integrity
* Improves reliability
* Introduces enterprise-level validation

## 🚀 Conclusion

Regex validation is a critical step in real-world systems to ensure only correctly formatted data enters the system.
