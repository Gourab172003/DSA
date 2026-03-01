import java.util.Arrays;

class MajorityElement {

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int ans = nums[0];
        int freq = 1;
        int size = nums.length;

        for(int i = 1; i < size; i++)
        {
            if(ans == nums[i])
            {
                freq++;
            }
            else
            {
                ans = nums[i];
                freq = 1;
            }

            if(freq > size/2)
            {
                return ans;
            }
        }

        return ans; 
    }

    public static void main(String args[])
    {
        int nums[]={2,2,1,1,1,2,2};

        int result = majorityElement(nums);

        System.out.println("Majority Element is: " + result);
    }
}



// Brute Force Technique
class MajorityElement{

    public static int majorityElement(int[] nums)
    {
        int n = nums.length;
        for(int i = 0; i < n; i++)
        {
            int count = 0;

            
            for(int j = 0; j < n; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }

          
            if(count > n/2)
            {
                return nums[i];
            }
        }

        return -1; 
    }

    public static void main(String args[])
    {
        int nums[] = {2,2,1,1,1,2,2};

        int result = majorityElement(nums);

        System.out.println("Majority Element is: " + result);
    }

}
