class Solution {
    public boolean isPalindromic(String s) {

        String palindrome = "";

        
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String snippet = toBinary(ch);

            palindrome += snippet;
        }

      
        int j = 0;

        for (int k = palindrome.length() - 1;
             k >= palindrome.length() / 2;
             k--) {

            if (palindrome.charAt(j) != palindrome.charAt(k)) {
                return false;
            }

            j++;
        }

        return true;
    }

    public String toBinary(char a) {

        int num = (int) a;

        String binary = Integer.toBinaryString(num);

       
        while (binary.length() < 8) {
            binary = "0" + binary;
        }

        return binary;
    }
}