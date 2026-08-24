class Solution {
    public int myAtoi(String s) {
        int i = 0;

    
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        return convert(s, i, 0, sign);
    }

    private int convert(String s, int i, long num, int sign) {
        if (i == s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') {
            long result = num * sign;
            if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return (int) result;
        }

        num = num * 10 + (s.charAt(i) - '0');

   
        if (num > Integer.MAX_VALUE + 1L) {
            num = Integer.MAX_VALUE + 1L;
        }

        return convert(s, i + 1, num, sign);
    }
}