class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ab = new StringBuilder("");
        StringBuilder bc = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                ab.append(Character.toLowerCase(c));
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                bc.append(Character.toLowerCase(c));
            }
        }

        return ab.toString().equals(bc.toString());
    }
}