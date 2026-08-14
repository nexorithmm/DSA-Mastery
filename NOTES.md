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
---

---

# 💚 DSA #009 - Reverse an Array

## 📌 Problem Statement

Given an integer array, reverse the elements of the array **in-place**.

### Example

```text
Input:
[10, 20, 30, 40, 50]

Output:
[50, 40, 30, 20, 10]
```

---

## 💡 Approach - Two Pointers

We use two pointers:

```text
i → beginning of the array
j → end of the array
```

While `i < j`:

1. Swap `array[i]` and `array[j]`
2. Increment `i`
3. Decrement `j`
4. Continue until the pointers meet

---

## 💻 Java Solution

```java
public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        int i = 0;
        int j = array.length - 1;

        while (i < j) {

            int current = array[i];

            array[i] = array[j];

            array[j] = current;

            i++;
            j--;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
```

### Output

```text
50 40 30 20 10
```

---

## 🔍 Dry Run

Initial:

```text
[10, 20, 30, 40, 50]
 ↑                 ↑
 i                 j
```

First swap:

```text
[50, 20, 30, 40, 10]
     ↑           ↑
     i           j
```

Second swap:

```text
[50, 40, 30, 20, 10]
          ↑
       center
```

Now:

```text
i >= j
```

Loop stops.

---

## ⚡ Complexity

### Time Complexity

```text
O(n)
```

We perform approximately `n/2` swaps.

```text
O(n/2) → O(n)
```

### Space Complexity

```text
O(1)
```

Only one temporary variable is used.

---

## 🧠 Why Two Pointers?

The two-pointer technique allows us to process the array from both ends.

```text
i → → →       ← ← ← j
```

We swap the corresponding elements and move toward the center.

This allows the array to be reversed **in-place**.

---

## ❌ Reverse Traversal vs Actual Reversal

Reverse traversal:

```java
for (int i = array.length - 1; i >= 0; i--) {
    System.out.println(array[i]);
}
```

Output:

```text
50
40
30
20
10
```

But the original array is still:

```text
[10, 20, 30, 40, 50]
```

Therefore, this is only **reverse traversal**.

The two-pointer approach actually changes the array:

```text
Before:
[10, 20, 30, 40, 50]

After:
[50, 40, 30, 20, 10]
```

---

## 🎯 Key Learning

```text
Two Pointers
     ↓
Swap opposite elements
     ↓
Move toward center
     ↓
In-place reversal
```

---

## 🏆 DSA #009 Status

```text
Problem   → Reverse an Array
Technique → Two Pointers
Time      → O(n)
Space     → O(1)
Status    → ✅ Completed
```

# 💚 DSA #010 – Frequency of Elements

## 📌 Problem Statement

Given an integer array, find the frequency of each element.

---

### Example

#### Input

[1, 2, 2, 3, 1, 4, 2]

#### Output

1 → 2
2 → 3
3 → 1
4 → 1

---

# 💡 Approach 1 – Brute Force

### Idea

Use nested loops to count how many times each element occurs.

We use a `boolean[] visited` array to avoid counting the same element again.

### Code

int[] array = {1, 2, 2, 3, 1, 4, 2};

boolean[] visited = new boolean[array.length];

for (int i = 0; i < array.length; i++) {

    if (visited[i]) {
        continue;
    }

    int count = 0;

    for (int j = 0; j < array.length; j++) {

        if (array[i] == array[j]) {
            count++;
            visited[j] = true;
        }
    }

    System.out.println(array[i] + " -> " + count);
}

### Output

1 → 2
2 → 3
3 → 1
4 → 1

### Complexity

Time: O(n²)

Space: O(n)

---

# ⚡ Approach 2 – HashMap

### Idea

Use a `HashMap` to store:

Element → Frequency

For every element, increase its frequency by `1`.

### Code

int[] array = {1, 2, 2, 3, 1, 4, 2};

HashMap<Integer, Integer> hashMap = new HashMap<>();

for (int i = 0; i < array.length; i++) {
hashMap.put(
array[i],
hashMap.getOrDefault(array[i], 0) + 1
);
}

for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
System.out.println(entry.getKey() + " -> " + entry.getValue());
}

### Output

1 → 2
2 → 3
3 → 1
4 → 1

---

## 🧠 Key Concept

hashMap.getOrDefault(array[i], 0) + 1

If the element doesn't exist:

0 + 1 = 1

If the element already exists:

existing frequency + 1

---

## 🔍 Dry Run

Input:

[1, 2, 2, 3, 1, 4, 2]

1 → 1
2 → 1
2 → 2
3 → 1
1 → 2
4 → 1
2 → 3

Final:

1 → 2
2 → 3
3 → 1
4 → 1

---

# ⚖️ Comparison

| Approach | Time | Space |
|---|---|---|
| Brute Force | O(n²) | O(n) |
| HashMap | O(n) average | O(n) |

---

## 🎯 Key Takeaway

The brute-force approach helps us understand the problem using nested loops.

The HashMap approach is better because it reduces the time complexity from O(n²) to O(n) average.

### Remember

Frequency Problem
↓
Think HashMap
↓
Element → Count

---

## ✅ DSA #010 Completed

Topic: Frequency of Elements

Brute Force: O(n²)

Optimal: O(n) average

Space: O(n)