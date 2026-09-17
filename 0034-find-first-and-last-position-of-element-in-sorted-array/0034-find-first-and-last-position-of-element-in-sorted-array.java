class Solution {
    public static int lowerBound(int[] nums, int target) {
        int l = 0;
        int u = nums.length - 1;
        int ans = nums.length;

        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                u = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] nums, int target) {
        int l = 0;
        int u = nums.length - 1;
        int ans = nums.length;

        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (nums[mid] > target) {
                ans = mid;
                u = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, target);
        if (lb == n || nums[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, upperBound(nums, target) - 1};
    }
}