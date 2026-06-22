# UC20: Exception Handling During Search Operations

## 📌 Overview

This use case introduces defensive programming by preventing search operations on an empty bogie list.

## ❗ Problem

Earlier search implementations assumed data always exists.

This leads to:

* Invalid operations
* Misleading results
* Poor system reliability

## 🎯 Goal

Stop execution early if no bogies are available.

## ⚙️ Flow

1. User triggers search
2. System checks if bogie list is empty
3. If empty → throws IllegalStateException
4. Search stops immediately
5. User receives error message

## 🧠 Concepts Used

* Defensive Programming
* Fail-Fast Principle
* IllegalStateException
* Runtime Exception Handling
* State Validation

## ⚠️ Validation Rule

Search operation is NOT allowed when:

* Array is null
* Array is empty

## 📊 Output

Displays meaningful error instead of executing invalid logic.

## 🚀 Benefits

* Prevents unnecessary computation
* Avoids incorrect program behavior
* Improves code robustness
* Makes system predictable

## 🔥 Conclusion

Fail-fast validation ensures the system behaves correctly by stopping invalid operations early, which is critical in real-world applications.
