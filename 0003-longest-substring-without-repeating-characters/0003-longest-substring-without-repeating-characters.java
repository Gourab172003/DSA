class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         int target = 0;

        HashMap<Character, Integer> ab = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            ab.clear();   
            int c = 0;    

            for (int j = i; j < s.length(); j++) {

                if (ab.containsKey(s.charAt(j))) {
                    break;
                } else {
                    ab.put(s.charAt(j), 1);
                    c++;
                }
            }

            if (target < c) {
                target = c;
            }
        }
        return target;
    }
}