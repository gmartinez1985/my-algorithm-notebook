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
When I first read the problem, my immediate thought was:
"How do I check if a value appears more than once without comparing every element to every other?"

My instinct was to avoid a brute-force O(n²) solution.
Then I remembered that a set only stores unique values. That triggered the idea:
"What if I track what I’ve already seen, and the moment I see a repeat, I return true?"

I briefly considered sorting the array and then checking for adjacent duplicates, which would work but takes O(n log n) time.
However, the set-based approach is more direct and efficient in terms of readability and performance—especially since the problem doesn't require the result to be in any order.

That’s how I settled on using a HashSet.

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
