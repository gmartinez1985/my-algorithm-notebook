class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letterCountMap = new HashMap<>();

        // If the length of both words is different, they can't be anagrams
        if(s.length() != t.length()) {
            return false;
        }

        // Fill the hash map with the letter frequency of the 1st word
        for(int i=0; i<s.length(); i++) {            
            letterCountMap.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }

        // For each letter of the second word, decrease its frequency from the hash map
        for(int i=0; i<t.length(); i++) {                        
            letterCountMap.compute(t.charAt(i), (k, v) -> {
                if (v == null) return null;
                int nuevoValor = v - 1;
                return nuevoValor == 0 ? null : nuevoValor;
            });
        }

        // If the hash map is empty, then both word have the same frequency for all their letters
        if(letterCountMap.isEmpty()) {
            return true;
        }
        return false;
    }
}
