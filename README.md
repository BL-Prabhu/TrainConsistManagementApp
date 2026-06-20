# UC12 - Safety Compliance Check for Goods Bogies

## 📌 Overview

This use case enforces real-world safety rules on goods bogies using Java Streams and lambda expressions.

## ❗ Problem Statement

Earlier use cases allowed any cargo assignment without validation, which can lead to:

* Unsafe train configurations
* Violation of domain rules
* Operational hazards

## 🎯 Objective

Ensure safety compliance:

* Cylindrical bogies must carry Petroleum only

## 🔧 Technologies Used

* Java Streams API
* Lambda Expressions
* allMatch() Terminal Operation

## ▶️ Flow

1. User provides list of goods bogies
2. System converts list to stream
3. allMatch() validates each bogie
4. Rule applied:

    * Cylindrical → Petroleum only
5. Displays safety result

## 📊 Sample Output

--- Safety Compliance Result ---
Train is SAFE for operation ✅

--- Invalid Scenario ---
Train is NOT SAFE ❌
Rule Violated: Cylindrical bogie must carry Petroleum only

## 🧠 Key Concepts

* stream()
* allMatch()
* Lambda expressions
* Short-circuit evaluation

## ✅ Benefits

* Prevents unsafe cargo assignments
* Enforces business rules
* Improves system reliability
* Uses declarative programming

## 🚀 Conclusion

UC12 introduces safety validation using streams, ensuring that only compliant train formations proceed further in the system.
