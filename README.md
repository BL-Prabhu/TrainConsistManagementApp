# UC15: Safe Cargo Assignment Using try-catch-finally

## 📌 Overview

This use case demonstrates safe runtime handling of cargo assignment using structured exception handling.

## ❗ Problem

During runtime:

* Unsafe cargo may be assigned
* System may crash if not handled

Example:
Assigning petroleum to a rectangular bogie is unsafe.

## 🎯 Goal

Handle unsafe assignments gracefully using:

* try
* catch
* finally

## ⚙️ Flow

1. User assigns cargo
2. System validates compatibility
3. If unsafe → throw exception
4. Exception is caught
5. Error message displayed
6. finally block executes
7. Program continues safely

## 🧠 Concepts Used

* Runtime Exception
* Custom Exception
* try-catch-finally
* Graceful Failure Handling
* Defensive Programming

## 📊 Output

* Success message for valid assignments
* Error message for unsafe cases
* Completion log always printed

## ✅ Key Rule

Rectangular bogie cannot carry petroleum

## 🚀 Benefits

* Prevents application crash
* Ensures runtime safety
* Provides user-friendly feedback
* Guarantees execution of critical logic

## 🔥 Conclusion

Use structured exception handling to manage runtime risks without stopping the system.
