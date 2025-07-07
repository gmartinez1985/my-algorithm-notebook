class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frecuencyS = new HashMap<>();
        HashMap<Character, Integer> frecuencyT = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(char c : s.toCharArray()) {
            frecuencyS.put(c, frecuencyS.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            frecuencyT.put(c, frecuencyT.getOrDefault(c, 0) + 1);
        }

        return frecuencyS.equals(frecuencyT);
    }
}
