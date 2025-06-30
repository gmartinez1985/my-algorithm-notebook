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

## 💡 Intuition

We want to detect if there's any **duplicate** value in the array.  
A good approach is to use a **set** to track which elements we've already seen.

---

## 🧪 Approach

1. Create an empty set.
2. Loop through each number in `nums`.
3. If the number is already in the set → return `true`.
4. Otherwise, add the number to the set.
5. If the loop completes, return `false`.

---

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
