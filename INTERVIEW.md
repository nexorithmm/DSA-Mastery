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