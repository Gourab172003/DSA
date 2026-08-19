class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while (m <= h) {
            if (nums[m] == 0) {
                swipe(nums, m, l);
                m++; l++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                swipe(nums, m, h);
                h--;
            }
        }
    }

    public void swipe(int A[], int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}