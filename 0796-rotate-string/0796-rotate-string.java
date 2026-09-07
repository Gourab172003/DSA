class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        char[] arr = s.toCharArray();

        int n = s.length();
        int i = 0;

        while (i < n) {

            char temp = arr[0];
            int j = 0;

            while (j < n - 1) {
                arr[j] = arr[j + 1];
                j++;
            }

            arr[n - 1] = temp;

            if (new String(arr).equals(goal)) {
                return true;
            }

            i++;
        }

        return false;
    }
}