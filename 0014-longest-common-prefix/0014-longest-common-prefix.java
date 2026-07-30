import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs); 

        StringBuilder ab = new StringBuilder("");
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        int minLen = Math.min(first.length, last.length);

        for (int i = 0; i < minLen; i++) {
            if (first[i] == last[i]) {
                ab.append(first[i]);
            } else {
                break;
            }
        }

        return ab.toString();
    }
}