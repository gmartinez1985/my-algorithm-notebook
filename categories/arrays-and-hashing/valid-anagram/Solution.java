class Solution {
    public boolean isAnagram(String s, String t) {
        // If the length of both words is different, they can't be anagrams
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letterCounts = new HashMap<>();      

        // Count letters from the first string
        for (char c : s.toCharArray()) {
            letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using letters from the second string
        for (char c : t.toCharArray()) {
            Integer count = letterCounts.get(c);
            if (count == null) {
                return false; // Letter not found in first string
            }
            if (count == 1) {
                letterCounts.remove(c); // Remove when count reaches 0
            } else {
                letterCounts.put(c, count - 1);
            }
        }

        // If all counts canceled out, the map should be empty
        return letterCounts.isEmpty();
    }
}
