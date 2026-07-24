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


