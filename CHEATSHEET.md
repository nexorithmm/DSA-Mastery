# 💚 DSA #001 - Largest Element in an Array

## 🧠 Logic

- Assume the first element is the largest.
- Traverse the array.
- Update the largest whenever a bigger element is found.

## 📝 Algorithm

largest = array[0]

For each element
if(element > largest)
largest = element

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

A single traversal is enough to find the largest element.

------------------------------------------------------------

# 💚 DSA #002 - Smallest Element in an Array

## 🧠 Logic

- Assume the first element is the smallest.
- Traverse the array.
- Update the smallest whenever a smaller element is found.

## 📝 Algorithm

smallest = array[0]

For each element
if(element < smallest)
smallest = element

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

Initialize with the first element to avoid unnecessary comparisons.

------------------------------------------------------------

# 💚 DSA #003 - Second Largest Element

## 🧠 Logic

Maintain two variables:
- largest
- secondLargest

Update both during a single traversal.

## 📝 Algorithm

largest = Integer.MIN_VALUE
secondLargest = Integer.MIN_VALUE

For each element

If element > largest
secondLargest = largest
largest = element

Else if element > secondLargest && element != largest
secondLargest = element

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

Always check element != largest to handle duplicate values correctly.

------------------------------------------------------------

# 💚 DSA #004 - Second Smallest Element

## 🧠 Logic

Maintain two variables:
- smallest
- secondSmallest

Update both during a single traversal.

## 📝 Algorithm

smallest = Integer.MAX_VALUE
secondSmallest = Integer.MAX_VALUE

For each element

If element < smallest
secondSmallest = smallest
smallest = element

Else if element < secondSmallest && element != smallest
secondSmallest = element

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

Always check element != smallest to handle duplicate values correctly.

------------------------------------------------------------

# 💚 DSA #005 - Sum of Array Elements

## 🧠 Logic

Initialize sum as 0.

Traverse the array and add every element.

## 📝 Algorithm

sum = 0

For each element
sum += element

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

Use an enhanced for-loop when indexes are not required.

------------------------------------------------------------

# 💚 DSA #006 - Average of Array Elements

## 🧠 Logic

Find the sum of all elements.

Divide the sum by the total number of elements.

## 📝 Algorithm

sum = 0

For each element
sum += element

average = (double) sum / array.length

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

Cast the sum to double before division to avoid integer division.

------------------------------------------------------------

# 💚 DSA #007 - Count Even and Odd Numbers

## 🧠 Logic

Traverse the array.

If element % 2 == 0, increment evenCount.

Otherwise, increment oddCount.

## 📝 Algorithm

evenCount = 0
oddCount = 0

For each element

If element % 2 == 0
evenCount++

Else
oddCount++

## ⚡ Time Complexity

O(n)

## 💾 Space Complexity

O(1)

## 🎯 Interview Tip

The modulus (%) operator is the simplest and most common way to determine whether a number is even or odd.
---

# 💚 DSA Cheat Sheet

## Count Positive, Negative & Zero Elements

### 🧠 Logic

Traverse the array once.

If number > 0

→ Positive Count++

Else if number < 0

→ Negative Count++

Else

→ Zero Count++

---

### 📝 Algorithm

positiveCount = 0

negativeCount = 0

zeroCount = 0

For each element

If element > 0
positiveCount++

Else if element < 0
negativeCount++

Else
zeroCount++

---

### ⚡ Time Complexity

O(n)

---

### 💾 Space Complexity

O(1)

---

### 🎯 Interview Tip

Use comparison operators (`>`, `<`, `==`) to classify values while traversing the array only once.
---

---

## 💚 DSA #009 - Reverse an Array

### 🔄 Two Pointer Technique

```java
int i = 0;
int j = array.length - 1;

while (i < j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;

    i++;
    j--;
}
```

### 🧠 Key Idea

```text
i → Start
j → End

Swap → Move → Swap → Move
```

### ⚡ Complexity

```text
Time  → O(n)
Space → O(1)
```

### 📌 Remember

```text
Reverse traversal ≠ Actual reversal

Reverse traversal:
Print from end → array remains unchanged

Two pointers:
Swap from both ends → array is reversed in-place
```

# 💚 DSA #010 – Frequency of Elements

## 🔑 Core Pattern

Frequency Counting

Element → Frequency

Think HashMap whenever the problem asks:

- How many times does each element occur?
- Count occurrences
- Find frequency
- Count characters
- Count duplicate values

---

## ⚡ Optimal Approach

Use:

HashMap<Integer, Integer> hashMap = new HashMap<>();

Update frequency:

hashMap.put(
array[i],
hashMap.getOrDefault(array[i], 0) + 1
);

---

## 🧠 getOrDefault()

hashMap.getOrDefault(key, 0)

Means:

Key exists    → return existing value
Key not found → return 0

Then:

current frequency + 1

---

## 🔍 Example

[1, 2, 2, 3, 1, 4, 2]

Final frequency:

1 → 2
2 → 3
3 → 1
4 → 1

---

## 🐢 Brute Force

Technique:

Nested Loops
+
visited[]

Complexity:

Time  → O(n²)
Space → O(n)

---

## 🚀 Optimal

Technique:

HashMap

Complexity:

Time  → O(n) average
Space → O(n)

---

## ⚖️ Quick Comparison

| Approach | Time | Space |
|---|---|---|
| Brute Force | O(n²) | O(n) |
| HashMap | O(n) average | O(n) |

---

## 🎯 Interview Shortcut

Frequency / Count Occurrences
↓
HashMap
↓
Element → Count

---

## 💡 Remember

Brute Force → Understand
HashMap     → Optimize

DSA #010 — Completed ✅
---

# DSA #011 — Find Duplicate Elements

## 📌 Problem

Find all elements that appear more than once in an integer array.

Each duplicate element should be reported only once.

## 🧠 Approaches

### Brute Force

Use nested loops to compare elements.

Time → O(n²)

Space → O(1)

### HashSet

Use HashSet to check whether an element has already been seen.

Time → O(n) average

Space → O(n)

### Two HashSets

Use one HashSet for seen elements and another HashSet to track duplicates that have already been printed.

Time → O(n) average

Space → O(n)

### HashMap

Store:

element → frequency

Then print elements whose frequency is greater than 1.

Time → O(n) average

Space → O(n)

### O(1) Extra Space

Use nested loops without an additional data structure.

Time → O(n²)

Space → O(1)

## 🔍 Comparison

| Approach | Time | Space |
|---|---:|---:|
| Brute Force | O(n²) | O(1) |
| HashSet | O(n) average | O(n) |
| Two HashSets | O(n) average | O(n) |
| HashMap | O(n) average | O(n) |
| O(1) Space | O(n²) | O(1) |

## 🎯 Pattern

Need to check whether an element was seen?

→ HashSet

Need frequency/count?

→ HashMap

Need constant extra space?

→ Brute Force / Sorting / Constraint-based approach

## 💡 Key Takeaway

The main trade-off is:

O(n²) Time + O(1) Space

vs.

O(n) Average Time + O(n) Space

Choose the approach according to the problem constraints.

## 📂 Repository

Class Name → FindDuplicateElements

Topic → Arrays

Concepts → Array Traversal, Nested Loops, HashSet, HashMap, Frequency Counting, Duplicate Detection

## ✅ Status

DSA #011 — Completed
---

## #012 — Move Zeroes

### Problem
Move all `0`s to the end of the array while maintaining the relative order of non-zero elements.

### Example
Input: `[0, 1, 0, 3, 12]`
Output: `[1, 3, 12, 0, 0]`

### Approach 1 — Two Passes

1. Use a pointer `j = 0`.
2. Traverse the array.
3. Move every non-zero element to `nums[j]`.
4. Increment `j`.
5. Fill the remaining positions with `0`.

### Approach 2 — One Pass / Swap ⭐

Use two pointers:

- `i` → scans the array.
- `j` → tracks the position for the next non-zero element.

When `nums[i] != 0`:

- Swap `nums[i]` with `nums[j]`.
- Increment `j`.

### Complexity

Time: `O(n)`
Space: `O(1)`

### Pattern
**Two Pointers + In-Place Array Manipulation**

---

## #013 — Missing Number

### Problem
Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, find the only missing number.

### Example
Input: `[3, 0, 1]`
Output: `2`

### Approach 1 — Mathematical Sum

Expected sum of numbers from `0` to `n`:

`n * (n + 1) / 2`

Then:

`Missing Number = Expected Sum - Actual Array Sum`

### Complexity

Time: `O(n)`
Space: `O(1)`

### Approach 2 — XOR ⭐

Important XOR properties:

- `x ^ x = 0`
- `x ^ 0 = x`

XOR all numbers from `0` to `n` with all elements of the array.

Matching numbers cancel each other, leaving the missing number.

### Complexity

Time: `O(n)`
Space: `O(1)`

### Pattern
**XOR + Array Traversal**

---

## Quick Revision

| Problem | Approach | Time | Space |
|---|---|---|---|
| #012 Move Zeroes | Two Passes | O(n) | O(1) |
| #012 Move Zeroes | Two Pointers / Swap ⭐ | O(n) | O(1) |
| #013 Missing Number | Mathematical Sum | O(n) | O(1) |
| #013 Missing Number | XOR ⭐ | O(n) | O(1) |