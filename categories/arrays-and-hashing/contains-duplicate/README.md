# Contains Duplicate

**Platform:** [NeetCode](https://neetcode.io/problems/duplicate-integer?list=blind75)

**Difficulty:** Easy

**Category:** Arrays & Hashing

---

## ❓ Problem statement

Given an integer array `nums`, return `true` if any value appears more than once in the array, otherwise return `false`.

---

## 📘 Examples

### Example 1:
```
Input: nums = [1, 2, 3, 3]

Output: true
```

### Example 2:
```
Input: nums = [1, 2, 3, 4]

Output: false
```

---

## 🧠 Thought Process
The goal is to determine whether any value appears more than once in the array.
A brute-force solution would involve comparing each element with every other, but this leads to O(n²) time complexity, which is inefficient for large inputs.
![image](https://github.com/user-attachments/assets/00320af4-163f-4457-89ea-569160c2b29d)

To improve efficiency, it's useful to recognize that a set data structure naturally enforces uniqueness. This insight suggests a more optimal strategy:
track seen values using a set, and return early if a duplicate is encountered.
![image](https://github.com/user-attachments/assets/de344707-b09a-427d-b3e6-00edaad6f778)

An alternative approach would involve sorting the array first, then scanning linearly to check for adjacent duplicates. While this method works and uses O(1) extra space, it increases the time complexity to O(n log n), which is unnecessary given a more efficient O(n) solution exists with a set.

Based on this reasoning, the set-based method provides a clear, efficient, and easy-to-implement solution to the problem.

## ⏱️ Complexity

- **Time:** O(n)  
- **Space:** O(n)

---

## 🔎 Final Pseudocode

```plaintext
function containsDuplicate(nums):
    seen = empty set

    for num in nums:
        if num in seen:
            return true
        add num to seen

    return false
```

## ✅ Final thoughts
- Very efficient and simple thanks to the properties of HashSet.
- If memory is a constraint, a sorting + linear scan approach (O(n log n) time, O(1) extra space) could be considered.
