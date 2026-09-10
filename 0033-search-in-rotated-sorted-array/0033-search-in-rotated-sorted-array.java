class Solution {
    public int search(int[] nums, int target) {

        int L = 0;
        int H = nums.length - 1;

        while (L <= H) {
            int mid = (L + H) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[L] <= nums[mid]) {
                
                if (nums[L] <= target && target < nums[mid]) {
                    H = mid - 1;
                } else {
                    L = mid + 1;
                }
            } else {
                
                if (nums[mid] < target && target <= nums[H]) {
                    L = mid + 1;
                } else {
                    H = mid - 1;
                }
            }
        }
        return -1;
    }
}