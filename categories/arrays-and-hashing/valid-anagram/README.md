# Contains Duplicate

**Platform:** [NeetCode](https://neetcode.io/problems/is-anagram?list=blind75)

**Difficulty:** Easy

**Category:** Arrays & Hashing

---

## ❓ Problem statement
Given two strings `s` and `t`, return `true` if the two strings are anagrams of each other, otherwise return `false`.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

---

## 📘 Examples

### Example 1:
```
Input: s = "racecar", t = "carrace"

Output: true
```

### Example 2:
```
Input: s = "jar", t = "jam"

Output: false
```
---

## 🧱 Constraints
- ´s´ and ´t´ consist of lowercase English letters.

---

## 🧠 Thought Process
This problema can be solved in O(n) time complexity using a hashmap. First it will be processed one of the two words, counting the number of times each letter appears on it:
![image](https://github.com/user-attachments/assets/af0427de-d088-4366-ab89-48c8324c9651)

After this, the inverse process can be applied with the other word. This means to substract 1 for each letter occurrence on the map. If at the end of this 2nd word processing the map is empty, then both words are anagrams:
![image](https://github.com/user-attachments/assets/5a27edd6-d606-47f9-87a7-09b16c9b93a4)

In the case of a non-valid pair of words, the set at the end won't be empty:
![image](https://github.com/user-attachments/assets/a1ec44e4-b3e0-4ea4-a80d-e9d62eca5dc6)
![image](https://github.com/user-attachments/assets/eecaacc3-d683-48cf-ba8b-438397c6c401)

## ⏱️ Complexity

- **Time:** O(s+t) - The algorithm performs a single pass on each word. Each lookup and insertion, and lookup and deletion, in a hash set takes O(1) on average, so the total time is proportional to the number of elements in both words.
- **Space:** O(n) - In the worst case (no duplicates), every element must be stored in the set, which grows linearly with the input size.

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
