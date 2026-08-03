class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> ab = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            ab.put(s.charAt(i), ab.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {       
            if (ab.get(s.charAt(i)) == 1) {
                return i;                            
            }
        }
        
        return -1;
    }
}