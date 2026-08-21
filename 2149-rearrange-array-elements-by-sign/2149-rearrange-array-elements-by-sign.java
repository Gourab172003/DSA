class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> ab = new LinkedList<>(); 
        Queue<Integer> bc = new LinkedList<>(); 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ab.add(nums[i]);
            } else {
                bc.add(nums[i]);
            }
        }

        int i = 0;
        int j = 1;
        while (!ab.isEmpty() && !bc.isEmpty()) {
            nums[i] = bc.remove();
            nums[j] = ab.remove();
            i += 2;
            j += 2;
        }
        while (!bc.isEmpty()) {
            nums[i] = bc.remove();
            i += 2;
        }
        while (!ab.isEmpty()) {
            nums[j] = ab.remove();
            j += 2;
        }

        return nums;
    }
}