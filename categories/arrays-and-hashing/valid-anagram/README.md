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

- **Time:** O(n) - The algorithm performs a single pass on each word.
- **Space:** O(n) - In the worst case (no duplicates), every letter of the first word must be stored in the set, which grows linearly with the input size.

---

## 🔎 Final Pseudocode

```plaintext
function isAnagram(s, t):
    create empty map letterCountMap

    if length of s ≠ length of t:
        return false

    // Count frequency of each character in string s
    for each character c in s:
        if c exists in letterCountMap:
            increment letterCountMap[c] by 1
        else:
            set letterCountMap[c] to 1

    // Subtract frequency using characters in string t
    for each character c in t:
        if c not in letterCountMap:
            return false  // more of this character than expected
        else:
            decrement letterCountMap[c] by 1
            if letterCountMap[c] becomes 0:
                remove c from letterCountMap

    if letterCountMap is empty:
        return true
    else:
        return false
```

## ✅ Final thoughts
- TBD
