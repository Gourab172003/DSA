class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, List<Integer>> positions = new HashMap<>();
        for (int i = 0; i < n; i++) {
            positions.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int sum = Integer.MAX_VALUE;
        for (List<Integer> p : positions.values()) {
            for (int i = 0; i + 2 < p.size(); i++) {
                int dist = 2 * (p.get(i + 2) - p.get(i));
                sum = Math.min(sum, dist);
            }
        }

        return sum == Integer.MAX_VALUE ? -1 : sum;
    }
}