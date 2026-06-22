# UC13: Performance Comparison (Loops vs Streams)

## Problem
Developers often assume Streams are faster than loops without measuring performance.

## Solution
This use case compares:
- Loop-based filtering
- Stream-based filtering

## Concepts Used
- System.nanoTime()
- Streams API
- Performance Benchmarking
- Loop iteration

## Flow
1. Create large dataset of bogies
2. Run loop-based filtering
3. Measure execution time
4. Run stream-based filtering
5. Measure execution time
6. Compare results

## Output
Displays execution time in nanoseconds for both approaches.

## Key Learning
- Streams improve readability
- Loops may perform better in some cases
- Always measure performance before optimizing