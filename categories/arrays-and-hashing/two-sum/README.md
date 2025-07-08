# Two sum

**Platform:** [NeetCode](https://neetcode.io/problems/two-integer-sum?list=blind75)

**Difficulty:** Easy

**Category:** Arrays & Hashing

---

## ❓ Problem statement

Given an array of integers `nums` and an integer `target`, return the indices `i` and `j` such that `nums[i] + nums[j] == target` and `i != j`.

You may assume that every input has exactly one pair of indices `i` and `j` that satisfy the condition.

Return the answer with the smaller index first.

---

## 📘 Examples

### Example 1:
```
Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
```

### Example 2:
```
Input: nums = [4,5,6], target = 10

Output: [0,2]
```

### Example 3:
```
Input: nums = [5,5], target = 10

Output: [0,1]
```

---

## 🧱 Constraints
- 2 <= nums.length <= 1000
- 10,000,000 <= nums[i] <= 10,000,000
- 10,000,000 <= target <= 10,000,000

---

## 🧠 Thought Process
An initial approach is the brute-force solution, which means that for each element in the array, we check the remaining part of the array to see if there exists a number that, when added to it, gives the expected target. However, this leads to an O(n²) time complexity, which is inefficient for large inputs.

![image](https://github.com/user-attachments/assets/bc134970-f37c-4af3-8437-89a60eb5745e)

To improve efficiency, the idea is to use a constant-time access data structure (a hash map) to store each number in the array along with its position.

![image](https://github.com/user-attachments/assets/f5d2c145-5b08-40c9-8e6d-8e2503d856c0)

This way, as we iterate through the array, we can calculate the number that would complement the current one to reach the target. Knowing this required number, we can check the auxiliary hash map to see if it exists—and if it does, retrieve its index.

However, it is important to validate that the index of the complement number is different from the current index, to ensure we do not pair the element with itself.

![image](https://github.com/user-attachments/assets/c40a136c-20fa-4eda-9676-5c70123c0a23)

## ⏱️ Complexity

- **Time:** O(n) - The algorithm performs two passes over the array of size n: one to build the auxiliary hash map, and another to find the matching pair. Each pass runs in linear time.
- **Space:** O(n) - An additional hash map is used to store each element of the array along with its index, requiring linear space.

---

## 🔎 Final Pseudocode

```plaintext
ALGORITHM twoSum(nums: Integer[], target: Integer): Integer[]
 result ← new array of size 2
 numberExists ← empty hash map

 // Fill the map with each number and its index
 for each num at index i in nums
  numberExists[num] ← i
 endfor

 // Search for the complement
 for each num at index i in nums
  complement ← target - num
  position_of_complement ← numberExists.get(complement)

  if position_of_complement ≠ null AND position_of_complement ≠ i
   result[0] ← i
   result[1] ← position_of_complement
   break the loop
  endif
 endfor

 return result
END_ALGORITHM
```

## ✅ Final thoughts
- The brute-force solution is intuitive but inefficient (O(n²) time).
- Using a hash map improves lookup time to O(1), reducing overall time complexity to O(n).
- For further optimization, a single-pass version is also possible (building and checking the map at the same time).
