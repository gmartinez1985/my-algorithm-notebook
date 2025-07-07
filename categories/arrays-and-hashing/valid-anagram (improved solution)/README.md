# contain Duplicate

**Platform:** [NeetCode](https://neetcode.io/problems/is-anagram?list=blind75)

**Difficulty:** Easy

**Category:** Arrays & Hashing

---

## ❓ Problem statement
Given two strings `s` and `t`, return `true` if the two strings are anagrams of each other, otherwise return `false`.

An anagram is a string that contain the exact same characters as another string, but the order of the characters can be different.

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
The key to finding the optimal solution lies in the constraints, which indicate that both strings contain only lowercase English letters. This limits the set of expected characters to just 26.

Considering this, the previous solution’s space complexity can be improved from O(n) to O(1), since the arrays to count frequency have a fixed size (26 characters). We simply need to count the frequency of each letter in both strings and compare the two frequency arrays:
![image](https://github.com/user-attachments/assets/6557904f-a520-41e6-b10a-c70bef0df6d6)

## ⏱️ Complexity

- **Time:** O(n) - The algorithm performs a single pass over each string.
- **Space:** O(1) - Only two arrays of 26 elements are used, which is constant space.

---

## 🔎 Final Pseudocode
> ℹ️ **Note:** The visual explanation uses fixed-size arrays to represent character frequencies for clarity, taking advantage of the constraint that all characters are lowercase English letters (`a`–`z`).  
> 
> In the actual implementation, **hash maps** are used instead to keep the solution more general and adaptable to larger character sets.


```plaintext
ALGORITHM isAnagram(s: String, t: String): Boolean
 frequencyS ← empty hash map
 frequencyT ← empty hash map

 if length of s ≠ length of t
  return false
 endif

 // Count frequency of characters in s
 for each character c in s
  if c exists in frequencyS
   increment frequencyS[c] by 1
  else
   set frequencyS[c] to 1
  endif
 endfor

 // Count frequency of characters in t
 for each character c in t
  if c exists in frequencyT
   increment frequencyT[c] by 1
  else
   set frequencyT[c] to 1
  endif
 endfor

 // Compare both frequency maps
 if frequencyS equals frequencyT
  return true
 else
  return false
 endif

END_ALGORITHM
```

## ✅ Final thoughts
- Exploiting the constraint of lowercase English letters allows using fixed-size arrays (26 elements) instead of hash maps.
- Comparing character frequencies guarantees both strings contain the same letters with the same counts.
- This approach avoids sorting, achieving O(n) time and O(1) space.
- Demonstrates how input constraints can lead to more efficient solutions.
