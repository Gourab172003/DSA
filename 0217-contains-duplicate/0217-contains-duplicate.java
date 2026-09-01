class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ab= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            ab.put(nums[i], ab.getOrDefault(nums[i], 0) + 1);
        }

        for(int i=0; i<nums.length; i++)
        {
            if(ab.get(nums[i])>1)
            {
                return true;
            }
        }
        return false;
        
    }
}