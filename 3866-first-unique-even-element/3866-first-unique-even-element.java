class Solution {
    public int firstUniqueEven(int[] nums) {

        LinkedHashMap<Integer, Integer> ab= new LinkedHashMap<>();
        if(nums.length==1 && nums[0]%2==0)
        {
            return nums[0];
        }
        else {
        for(int i=0;i<nums.length;i++)
        {
          ab.put(nums[i], ab.getOrDefault(nums[i], 0) +1);
        }

        for(int j=0; j<nums.length; j++)
        {
            if(nums[j]%2==0)
            {
                if(ab.get(nums[j])==1)
                {
                    return nums[j];
                    
                }
                else{
                    continue;
                }
            }
        }
        }
        return -1;
    }
}