class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> ab = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
        {
            ab.put(nums[i], 1);
        }

        int n = nums.length;

        for (int j = 1; j <= n; j++)
        {
            if (ab.containsKey(j))
            {
                continue;
            }
            else
            {
                result.add(j);
            }
        }

        return result;
    }
}