# 💚 DSA Mastery - Interview Questions

## 📚 DSA #001 - Largest Element in an Array

### Q1. What is the brute-force approach?
Sort the array and return the last element.

### Q2. What is the optimal approach?
Traverse the array once while maintaining the maximum element.

### Q3. Time Complexity?
O(n)

### Q4. Space Complexity?
O(1)

### Q5. Which variable stores the answer?
max

---

## 📚 DSA #002 - Smallest Element in an Array

### Q1. What is the optimal approach?
Traverse the array once while maintaining the minimum element.

### Q2. Time Complexity?
O(n)

### Q3. Space Complexity?
O(1)

### Q4. Which variable stores the answer?
min

### Q5. Which comparison is used?

```java
if(element < min)
```

---

## 📚 DSA #003 - Second Largest Element

### Q1. Why do we need two variables?
One stores the largest element and another stores the second largest.

### Q2. Time Complexity?
O(n)

### Q3. Space Complexity?
O(1)

### Q4. What happens when a new largest element is found?
The previous largest becomes the second largest.

### Q5. Can duplicate largest values become the second largest?
No.

---

## 📚 DSA #004 - Second Smallest Element

### Q1. What variables are required?
smallest and secondSmallest

### Q2. Time Complexity?
O(n)

### Q3. Space Complexity?
O(1)

### Q4. What happens when a new smallest element is found?
The previous smallest becomes the second smallest.

### Q5. Why do we initialize using Integer.MAX_VALUE?
To ensure every array element is initially smaller.

---

## 📚 DSA #005 - Sum of Array Elements

### Q1. Which variable stores the total?
sum

### Q2. Time Complexity?
O(n)

### Q3. Space Complexity?
O(1)

### Q4. Which loop is commonly used?
Enhanced For Loop

### Q5. Formula?

```
sum += element;
```

---

## 📚 DSA #006 - Average of Array Elements

### Q1. Formula for average?

```
Average = Sum / Number of Elements
```

### Q2. Time Complexity?
O(n)

### Q3. Space Complexity?
O(1)

### Q4. Which variable stores the sum?
sum

### Q5. Why divide by array.length?
Because it represents the total number of elements.

---

## 📚 DSA #007 - Count Even & Odd Numbers

### Q1. How do you identify an even number?

```java
number % 2 == 0
```

### Q2. How do you identify an odd number?

```java
number % 2 != 0
```

### Q3. Time Complexity?
O(n)

### Q4. Space Complexity?
O(1)

### Q5. Which variables are used?

- evenCount
- oddCount

---

## 📚 DSA #008 - Count Positive, Negative & Zero Elements

### Q1. How do you identify a positive number?

```java
number > 0
```

### Q2. How do you identify a negative number?

```java
number < 0
```

### Q3. How do you identify zero?

```java
number == 0
```

### Q4. Why is the time complexity O(n)?
Because every element is visited exactly once.

### Q5. Why is the space complexity O(1)?
Only three counter variables are used regardless of the array size.

---

# 📌 Common DSA Interview Tips

✅ Always analyze Time Complexity.

✅ Always analyze Space Complexity.

✅ Prefer a single traversal whenever possible.

✅ Use meaningful variable names.

✅ Explain your approach before writing code.

✅ Dry run your solution with a sample input.

✅ Think about edge cases:
- Empty array
- Single element
- Duplicate values
- Negative numbers
- All zeros
---

---

# 💚 DSA #009 - Reverse an Array

### Q1. How can you reverse an array in-place?

Use two pointers. One starts from the beginning and the other starts from the end. Swap the elements and move both pointers toward the center.

---

### Q2. What is the time complexity of reversing an array using two pointers?

```text
O(n)
```

Although only `n/2` swaps are performed, Big-O ignores the constant factor.

```text
O(n/2) → O(n)
```

---

### Q3. What is the space complexity?

```text
O(1)
```

Because only a temporary variable is used for swapping and no additional array is created.

---

### Q4. Why can't we achieve O(log n) time for reversing an array?

To reverse the complete array, the elements need to be processed. Therefore, the minimum time required is proportional to the number of elements.

```text
O(n)
```

is optimal.

---

### Q5. What is the difference between reverse traversal and actual reversal?

### Reverse Traversal

```java
for (int i = array.length - 1; i >= 0; i--) {
    System.out.println(array[i]);
}
```

This only prints the elements in reverse order.

The original array remains unchanged.

### Actual Reversal

Using two pointers:

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

This changes the original array.

---

## 🎯 Interview Pattern

```text
Start → End
  ↓      ↓
  i      j

while (i < j)
    swap
    i++
    j--
```

### Key Interview Answer

> The two-pointer technique reverses an array in-place by swapping elements from opposite ends and moving both pointers toward the center.

**DSA #009 Interview Preparation — Completed ✅**
---

# 💚 DSA #010 – Frequency of Elements

## 🎯 Interview Questions & Answers

### 1. How do you find the frequency of each element in an array?

Use a HashMap where the element is the key and its frequency is the value.

For every element, increase its count using getOrDefault().

Time Complexity: O(n) average
Space Complexity: O(n)

---

### 2. Why is HashMap preferred over nested loops?

Nested loops require O(n²) time because the array may be traversed repeatedly.

HashMap allows us to count frequencies in a single traversal on average.

Brute Force → O(n²)
HashMap → O(n) average

Therefore, HashMap is more efficient for frequency-counting problems.

---

### 3. What is the purpose of getOrDefault()?

getOrDefault() returns the existing value associated with a key.

If the key does not exist, it returns the specified default value.

Example:

hashMap.getOrDefault(array[i], 0)

If the element exists:
→ returns its current frequency

If the element doesn't exist:
→ returns 0

Then we add 1 to update the frequency.

---

### 4. How does the brute-force approach avoid duplicate output?

A boolean visited[] array is used.

When an element is counted, all positions containing that element are marked as visited.

When the outer loop reaches an already visited position, it skips that position.

This prevents the same element from being counted and printed again.

---

### 5. What is the difference between the two approaches?

Brute Force:

Time  → O(n²)
Space → O(n)

Technique → Nested loops + visited[]

HashMap:

Time  → O(n) average
Space → O(n)

Technique → HashMap frequency counting

HashMap is the preferred approach when additional space is allowed.

---

## 🧠 Interview Tip

If the interviewer says:

"Count the frequency of elements."

Immediately think:

Array
↓
HashMap
↓
Element → Frequency

---

## 🔥 Key Interview Statement

"I can solve the problem using nested loops in O(n²) time, but an efficient approach is to use a HashMap for frequency counting, which reduces the average time complexity to O(n) while using O(n) additional space."

---

## ✅ DSA #010 Interview Ready