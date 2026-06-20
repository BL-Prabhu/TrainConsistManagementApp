# UC9 - Group Bogies by Type (Collectors.groupingBy)

## 📌 Overview
This use case demonstrates grouping bogies into categories using Java Stream API.

## ❗ Problem in UC8
- Filtering gives flat list
- No categorization
- Difficult for reporting

## 🎯 Objective
Group bogies into structured categories using groupingBy.

## 🛠️ Technologies Used
- Java
- Stream API
- Collectors.groupingBy
- Map

## ▶️ Flow
1. Create bogie list
2. Convert to stream
3. Apply groupingBy()
4. Store result in Map
5. Display grouped bogies

## 📊 Sample Output

Type: Passenger
Sleeper (72, Passenger)
AC Chair (56, Passenger)
First Class (24, Passenger)

Type: Goods
Goods Carrier (0, Goods)
Parcel Van (0, Goods)

## 🚀 Key Concepts
- groupingBy()
- Map<K, List<V>>
- Data aggregation
- Structured transformation

## ✅ Benefits
- Organized data
- Better reporting
- Easy analytics
- Clean and readable