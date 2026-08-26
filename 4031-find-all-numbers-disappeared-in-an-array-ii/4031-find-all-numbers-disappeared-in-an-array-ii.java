class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> ab = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> b = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            ab.add(nums[i]);
        }

        int c = 0;
        int prev = lower;
        for (int i = lower; i < upper + 1; i++) {
            if (!ab.contains(i) && c == 0) {
                temp.add(i);
                c++;
                prev = i;
            }
            if (!ab.contains(i) && c != 0) {
                prev = i;
            }

            if (ab.contains(i) && c != 0) {
                temp.add(prev);
                b.add(temp);
                temp = new ArrayList<>();
                c = 0;
            }

            if (!ab.contains(i) && i == upper) {
                temp.add(prev);
                b.add(temp);
            }
        }
        return b;
    }
}