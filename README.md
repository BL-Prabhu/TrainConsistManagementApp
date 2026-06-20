# UC10 - Count Total Seats in Train (reduce)

## 📌 Overview
This use case demonstrates aggregation of bogie capacities into a single total value using Java Stream API.

## ❗ Problem in UC9
- Grouping gives structure but no metrics
- Cannot calculate totals
- No quantitative insights

## 🎯 Objective
Calculate total seating capacity of the train.

## 🛠️ Technologies Used
- Java
- Stream API
- map()
- reduce()

## ▶️ Flow
1. Create bogie list
2. Convert to stream
3. Extract capacities using map()
4. Apply reduce() to sum values
5. Display total capacity

## 📊 Sample Output

Total Seating Capacity: 242

## 🚀 Key Concepts
- map()
- reduce()
- Integer::sum
- Aggregation

## ✅ Benefits
- Provides real metrics
- Cleaner than loops
- Useful for analytics
- Improves decision making