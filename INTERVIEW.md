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
---

# DSA #011 — Find Duplicate Elements

## 🎤 Interview Questions & Answers

### Q1. How can you find duplicate elements in an array?

There are multiple approaches:

- Brute Force using nested loops
- HashSet
- HashMap

The approach depends on the required time and space complexity.

---

### Q2. What is the time complexity of the brute-force approach?

The brute-force approach uses nested loops.

Time Complexity → O(n²)

Space Complexity → O(1)

---

### Q3. Why is the brute-force approach O(n²)?

For each element, we may compare it with every other element in the array.

Therefore, the number of comparisons can grow approximately as:

n × n

So the time complexity is:

O(n²)

---

### Q4. How can HashSet be used to find duplicates?

A HashSet stores unique elements.

While traversing the array:

If the element already exists
↓
Duplicate found

Otherwise
↓
Add the element

Average complexity:

Time → O(n)

Space → O(n)

---

### Q5. What is the main advantage of HashSet?

HashSet provides fast average-case lookup.

It is useful when the main question is:

"Have I seen this element before?"

---

### Q6. Why can a simple HashSet approach print the same duplicate multiple times?

Consider:

[1, 1, 1]

The second `1` is detected as a duplicate.

The third `1` is also detected as a duplicate.

Therefore, simply printing whenever `contains()` returns true can produce:

1
1

If each duplicate should be printed only once, additional tracking logic is required.

---

### Q7. Why would you use HashMap instead of HashSet?

Use HashSet when you only need to know whether an element exists.

Use HashMap when you need the frequency of each element.

Example:

HashSet:
Have I seen 5?

HashMap:
How many times did 5 occur?

---

### Q8. How does HashMap solve the duplicate problem?

Store each element as a key and its frequency as the value.

Example:

Input:
[1, 2, 3, 2, 2, 4, 1]

Frequency:

1 → 2
2 → 3
3 → 1
4 → 1

Then print elements whose frequency is greater than 1.

Average complexity:

Time → O(n)

Space → O(n)

---

### Q9. Can duplicate detection be solved using O(1) extra space?

Yes.

A brute-force approach can use:

Time → O(n²)

Space → O(1)

The trade-off is that we use more time to avoid additional memory.

---

### Q10. What is the trade-off between Brute Force and HashMap?

Brute Force:

Time → O(n²)

Space → O(1)

HashMap:

Time → O(n) average

Space → O(n)

So:

Less Space
↓
More Time

More Space
↓
Less Time

---

### Q11. What is the difference between HashSet and HashMap for this problem?

| HashSet | HashMap |
|---|---|
| Stores unique elements | Stores key-value pairs |
| Checks existence | Stores frequency |
| Useful for duplicate detection | Useful for frequency counting |
| O(n) average traversal | O(n) average traversal |
| O(n) space | O(n) space |

---

### Q12. Which approach would you choose in an interview?

First understand the constraints.

If the interviewer prioritizes constant extra space:

Brute Force / Sorting / Constraint-based approach

If the interviewer prioritizes better time complexity:

HashSet / HashMap

---

## 🧠 Interview Pattern

Need to check existence?
↓
HashSet

Need frequency/count?
↓
HashMap

Need O(1) extra space?
↓
Brute Force / Sorting / Constraint-based approach

---

## 🎯 Interview Takeaway

The important concept is not only finding duplicates.

Understand the trade-off between:

Time Complexity
↕
Space Complexity

For this problem:

Brute Force → O(n²) Time + O(1) Space

HashSet → O(n) Average Time + O(n) Space

HashMap → O(n) Average Time + O(n) Space

Choose the approach based on the problem constraints.

---

## ✅ Status

DSA #011 — Completed

---


## #012 — Move Zeroes

### Basic Questions

**1. What is the goal of the Move Zeroes problem?**

Move all zeroes to the end of the array while maintaining the relative order of all non-zero elements.

**2. Can we use another array to solve this problem?**

A solution can use extra space, but the preferred solution modifies the original array in-place with `O(1)` extra space.

**3. What technique can be used to solve Move Zeroes efficiently?**

The **Two Pointers** technique.

**4. What do the two pointers represent?**

- `i` scans the array.
- `j` tracks the position where the next non-zero element should be placed.

**5. What is the optimal time complexity?**

`O(n)`

**6. What is the optimal space complexity?**

`O(1)`

**7. What is the difference between the two approaches we learned?**

The two-pass approach first moves all non-zero values and then fills the remaining positions with zeroes.

The one-pass approach uses two pointers and swaps elements while traversing the array.

---

## #013 — Missing Number

### Basic Questions

**1. What is the goal of the Missing Number problem?**

Given `n` distinct numbers in the range `[0, n]`, find the only number missing from the array.

**2. What approaches can be used to solve this problem?**

Two approaches we learned:

- Mathematical Sum
- XOR

**3. How does the Mathematical Sum approach work?**

Calculate the expected sum of numbers from `0` to `n` using:

`n * (n + 1) / 2`

Then subtract the actual array sum from the expected sum.

**4. What is the time complexity of the Mathematical Sum approach?**

`O(n)`

**5. What is the space complexity of the Mathematical Sum approach?**

`O(1)`

**6. How does the XOR approach work?**

XOR all numbers from `0` to `n` with all elements of the array.

All matching numbers cancel because:

`x ^ x = 0`

and:

`x ^ 0 = x`

The remaining value is the missing number.

**7. What is the time complexity of the XOR approach?**

`O(n)`

**8. What is the space complexity of the XOR approach?**

`O(1)`

**9. Which approach is preferred for interviews?**

The XOR approach is a strong solution because it achieves `O(n)` time and `O(1)` extra space without relying on the sum formula.

---

## Quick Interview Revision

### Move Zeroes
Pattern: **Two Pointers**

Time: `O(n)`

Space: `O(1)`

### Missing Number
Patterns: **Mathematical Sum / XOR**

Time: `O(n)`

Space: `O(1)`
---

# DSA Mastery — Interview Questions

## 🟢 DSA #014 — Remove Duplicates from Sorted Array

### Basic Questions

**1. What is the problem asking us to do?**

Remove duplicate elements from a sorted array in-place so that every unique element appears only once, and return the number of unique elements.

**2. Why does the fact that the array is sorted help us?**

Because duplicate elements are always adjacent to each other.

**3. Which pattern is used in the optimal solution?**

Two Pointers.

**4. What are the two pointers used for?**

- `i` scans the array.
- `j` tracks the position where the next unique element should be placed.

**5. What is the purpose of `temp` in our solution?**

`temp` stores the last unique element so we can compare it with the current element.

**6. Why do we start `i` from index 1?**

The first element is automatically considered unique, so we start checking from the second element.

**7. What happens when `array[i] != temp`?**

The current element is unique, so we place it at `array[j]`, update `temp`, increment `j`, and increment `count`.

**8. What happens when `array[i] == temp`?**

The element is a duplicate, so we skip it.

**9. Why don't we need to modify the remaining positions of the array?**

Only the first `count` positions contain the valid unique elements. The remaining positions are irrelevant to the result.

**10. What should we return for an empty array?**

`0`, because an empty array contains zero unique elements.

**11. What is the time complexity of the optimal solution?**

`O(n)`

**12. What is the space complexity of the optimal solution?**

`O(1)`

**13. What is the brute-force approach?**

Use an extra data structure such as a `HashSet` to store unique elements and then copy them back into the array.

**14. What is the complexity of the brute-force approach?**

Time: `O(n)`

Space: `O(n)`

**15. Why is the two-pointer approach better?**

Both approaches take `O(n)` time, but the two-pointer approach uses only `O(1)` extra space and modifies the original array in-place.

---

## 🧠 Interview Explanation

A good way to explain the optimal solution:

"Because the array is sorted, duplicate elements are adjacent. I use two pointers. The `i` pointer scans the array, while `j` points to the position where the next unique element should be placed. Whenever I find a value different from the last unique value, I place it at index `j` and increment the pointers. This gives O(n) time and O(1) extra space."

---

## 🔥 Quick Revision

Problem:
**Remove Duplicates from Sorted Array**

Pattern:
**Two Pointers**

Requirement:
**In-Place**

Time:
`O(n)`

Space:
`O(1)`

Edge Case:
**Empty array → return 0**

Optimal:
**Two Pointers ⭐**