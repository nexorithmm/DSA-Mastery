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