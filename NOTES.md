# 📚 DSA Mastery Notes

Welcome to my DSA learning journey.

This document contains concise notes, algorithms, complexity analysis, interview tips, and key takeaways for every problem I solve.

---

# ✅ DSA #001 - Largest Element in an Array

## Problem Statement
Given an integer array, find the largest element.

### Example

Input:
```
[5, 2, 9, 1, 7]
```

Output:
```
9
```

---

## Approach

- Assume the first element is the largest.
- Traverse the array starting from index 1.
- Compare each element with the current largest.
- If a larger element is found, update the largest value.
- Print the final largest element.

---

## Algorithm

1. Initialize `largest = array[0]`
2. Traverse the array from index `1`
3. Compare every element with `largest`
4. Update `largest` whenever a bigger value is found
5. Print the result

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Interview Tip

Never initialize the maximum element with `0`.

Always initialize it with the first element of the array so that the solution also works correctly for arrays containing negative numbers.

Example:

```
[-10, -5, -20]
```

---

## Key Takeaways

- Array Traversal
- Linear Search Concept
- Maximum Element Logic
- Time & Space Complexity Analysis

---

## Status

✅ Solved

--- 


# DSA #004 - Second Smallest Element in Array

## Problem Statement

Given an integer array, find the **second smallest distinct element**.

### Example

Input:

```text
[10, 25, 8, 25, 15]
```

Output:

```text
10
```

---

## Java Solution

```java
int[] array = {10, 25, 8, 25, 15};

int smallestElement = array[0];
int secondSmallestElement = Integer.MAX_VALUE;

for (int i = 1; i < array.length; i++) {

    if (array[i] < smallestElement) {
        secondSmallestElement = smallestElement;
        smallestElement = array[i];
    } else if (array[i] < secondSmallestElement && array[i] != smallestElement) {
        secondSmallestElement = array[i];
    }
}

if (secondSmallestElement == Integer.MAX_VALUE) {
    System.out.println("Second smallest element does not exist.");
} else {
    System.out.println("Second Smallest Element : " + secondSmallestElement);
}
```

---

## Approach

- Assume the first element is the smallest.
- Initialize the second smallest element as `Integer.MAX_VALUE`.
- Traverse the array only once.
- If a smaller element is found:
  - Update the second smallest with the previous smallest.
  - Update the smallest element.
- Otherwise, update the second smallest if the current element is smaller than it and different from the smallest.
- Print the second smallest element if it exists.

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Edge Cases

- Single element array
- Duplicate smallest elements
- All elements are equal
- Negative numbers

# DSA #002 - Smallest Element in Array

## Problem Statement

Given an integer array, find the smallest element.

### Example

Input:

```text
[10, 25, 8, 25, 15]
```

Output:

```text
8
```

---

## Java Solution

```java
int[] array = {10, 25, 8, 25, 15};

int smallestElement = array[0];

for (int i = 1; i < array.length; i++) {

    if (array[i] < smallestElement) {
        smallestElement = array[i];
    }

}

System.out.println("Smallest Element : " + smallestElement);
```

---

## Approach

- Assume the first element is the smallest.
- Traverse the array from the second element.
- Compare each element with the current smallest element.
- Update the smallest element whenever a smaller value is found.
- Print the final smallest element.

---

## Time Complexity

```
O(n)
```

Only one traversal of the array.

---

## Space Complexity

```
O(1)
```

Only one extra variable is used.

---

## Edge Cases

- Single element array
- Negative numbers
- Duplicate values
- Already sorted array

---

# DSA #003 - Second Largest Element in Array

## Problem Statement

Given an integer array, find the **second largest distinct element**.

### Example

Input:

```text
[10, 25, 8, 25, 15]
```

Output:

```text
15
```

---

## Java Solution

```java
int[] array = {10, 25, 8, 25, 15};

int largestNumber = array[0];
int secondLargestNumber = Integer.MIN_VALUE;

for (int i = 1; i < array.length; i++) {

    if (array[i] > largestNumber) {
        secondLargestNumber = largestNumber;
        largestNumber = array[i];
    } else if (array[i] > secondLargestNumber && array[i] != largestNumber) {
        secondLargestNumber = array[i];
    }

}

if (secondLargestNumber == Integer.MIN_VALUE) {
    System.out.println("Second largest element does not exist");
} else {
    System.out.println("Second Largest Element : " + secondLargestNumber);
}
```

---

## Approach

- Assume the first element is the largest.
- Store the second largest element as `Integer.MIN_VALUE`.
- Traverse the array once.
- If a larger element is found:
    - Update the second largest with the previous largest.
    - Update the largest.
- Otherwise, update the second largest if the current element is greater and different from the largest.
- Print the second largest element if it exists.

---

## Time Complexity

```
O(n)
```

---

## Space Complexity

```
O(1)
```

---

## Edge Cases

- Single element array
- Duplicate largest elements
- All elements are equal
- Negative numbers
-

# DSA #005 – Sum of Array Elements

## 📖 Problem Statement

Given an integer array, find the sum of all its elements.

### Example

**Input:**

```text
[10, 20, 30, 40, 50]
```

**Output:**

```text
150
```

---

## 💡 Approach

1. Initialize a variable `sum` with `0`.
2. Traverse the array using a loop.
3. Add each element to `sum`.
4. Print the final sum.

---

## ✅ Java Solution

```java
int[] array = {10, 20, 30, 40, 50};
int sum = 0;

for (int i = 0; i < array.length; i++) {
    sum += array[i];
}

System.out.println("Sum of Array Elements : " + sum);
```

---

## 🧮 Dry Run

| Index | Element | Sum |
|-------|---------|-----|
| 0 | 10 | 10 |
| 1 | 20 | 30 |
| 2 | 30 | 60 |
| 3 | 40 | 100 |
| 4 | 50 | 150 |

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`

- Every element is visited exactly once.

**Space Complexity:** `O(1)`

- Only one extra variable (`sum`) is used.

---

## 🌍 Real-World Applications

- Calculating total sales
- Finding total marks of students
- Computing total expenses
- Inventory quantity calculation
- Financial reporting
-

# DSA #006 – Average of Array Elements

## 📖 Introduction

The average of an array is calculated by adding all the elements and dividing the sum by the total number of elements.

This problem helps in understanding array traversal, accumulation, and type casting.

---

## 💡 Algorithm

1. Initialize a variable `sum` to 0.
2. Traverse the array.
3. Add each element to `sum`.
4. Divide `sum` by the total number of elements.
5. Type cast `sum` to `double` before division.

---

## 💻 Java Solution

```java
public class AverageOfArrayElements {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 51};

        int n = array.length;
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        double average = (double) sum / n;

        System.out.printf("Average of Array Elements : %.2f", average);
    }
}
```

---

## 🖥️ Output

```text
Average of Array Elements : 30.20
```

---

## 📊 Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(1)

---

## 🌍 Real-World Applications

- Student marks average
- Employee salary analysis
- Sensor data processing
- Sales analytics
- Performance reports

---

## 📌 Key Points

- Traverse the array once.
- Use an enhanced for-loop for readability.
- Cast to `double` before division.
- `printf("%.2f")` displays two decimal places.
-

# 💚 DSA #007 - Count Even and Odd Numbers

## 📖 Problem Statement

Given an integer array, count the number of even and odd elements.

---

## 💡 Logic

- Traverse the array.
- Check each element using the modulus (%) operator.
- If the remainder is 0, increment the even counter.
- Otherwise, increment the odd counter.

---

## 💻 Java Program

```java
int[] array = {10, 25, 8, 17, 30, 41, 56};

int evenCount = 0;
int oddCount = 0;

for (int element : array) {

    if (element % 2 == 0) {
        evenCount++;
    } else {
        oddCount++;
    }
}

System.out.println("Even Count : " + evenCount);
System.out.println("Odd Count  : " + oddCount);
```

---

## 📊 Output

```
Even Count : 4
Odd Count  : 3
```

---

## ⏱️ Time Complexity

```
O(n)
```

---

## 💾 Space Complexity

```
O(1)
```

---

## ✅ Key Points

- Even Number → number % 2 == 0
- Odd Number → number % 2 != 0
- Traverse the array only once.
- Interview-friendly solution.
---

# 💚 DSA #008 - Count Positive, Negative & Zero Elements

## 📖 Problem Statement

Given an integer array, count the number of:
- Positive elements
- Negative elements
- Zero elements

Print the total count of each category.

---

## 💡 Logic

- Initialize three counters:
  - positiveCount
  - negativeCount
  - zeroCount
- Traverse the array once.
- If the element is greater than 0, increment positiveCount.
- If the element is less than 0, increment negativeCount.
- Otherwise, increment zeroCount.

---

## 💻 Java Program

```java
int[] array = {10, -5, 0, 25, -8, 0, 15, -2};

int positiveCount = 0;
int negativeCount = 0;
int zeroCount = 0;

for (int number : array) {

    if (number > 0) {
        positiveCount++;
    } else if (number < 0) {
        negativeCount++;
    } else {
        zeroCount++;
    }
}

System.out.println("Positive Count : " + positiveCount);
System.out.println("Negative Count : " + negativeCount);
System.out.println("Zero Count     : " + zeroCount);
```

---

## 📊 Output

```
Positive Count : 3
Negative Count : 3
Zero Count     : 2
```

---

## ⏱️ Time Complexity

O(n)

---

## 💾 Space Complexity

O(1)

---

## ✅ Key Points

- Traverse the array only once.
- Use comparison operators to categorize elements.
- Maintain separate counters for each category.
- Efficient solution with constant extra space.