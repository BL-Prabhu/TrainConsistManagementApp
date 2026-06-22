# UC19: Binary Search for Bogie ID

## 📌 Overview

This use case introduces Binary Search to efficiently find a bogie ID from a sorted array.

## ❗ Problem

Linear Search (UC18):

* Slow for large datasets (O(n))
* Checks every element sequentially

## 🎯 Goal

Use Binary Search to improve search performance.

## ⚙️ Flow

1. User provides sorted bogie IDs
2. User enters search key
3. System calculates mid index
4. Compares key with mid value
5. Reduces search range by half
6. Repeats until found or exhausted
7. Displays result

## 🧠 Concepts Used

* Binary Search
* Divide and Conquer
* compareTo() for String comparison
* Index-based traversal (low, high, mid)
* Time Complexity O(log n)

## ⚠️ Important Condition

Binary Search ONLY works on sorted data.

## 📊 Output

Displays whether the bogie exists.

## 🚀 Benefits

* Very fast search (logarithmic time)
* Efficient for large datasets
* Reduces unnecessary comparisons

## 🔥 Conclusion

Binary Search is a highly efficient searching technique and is widely used in real-world systems where fast lookup is required.
