public class solution1
{
   public static int maxOnes(int[] nums) {
        int c = 0;  
        int f = 0;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;           
                if (c > f) {
                    f = c;    
                }
            } else {
                c = 0;         
            }
        }

        return f;
    }

    public static void main (String [] args)
    {
        int nums[]={0,0};
        int ans= maxOnes(nums);
        System.out.print(ans);
    }
}