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