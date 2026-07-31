class Solution {
    public int maxDepth(String s) {
        int S = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                c++;
                if (c > S) {
                    S = c;
                }
            } else if (s.charAt(i) == ')') {
                c--;
            }
        }
        return S;
    }
}