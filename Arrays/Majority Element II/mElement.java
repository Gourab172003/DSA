import java.util.*;
public class mElement {
    public static void majorityElement(int[] nums) {
        ArrayList<Integer> ab = new ArrayList<>();
        HashMap<Integer, Integer> ba = new HashMap<>();
        int length = nums.length / 3;

        for (int i = 0; i < nums.length; i++) {
            if (ba.containsKey(nums[i])) {
                ba.put(nums[i], ba.get(nums[i]) + 1);
            } else {
                ba.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> i : ba.entrySet()) { 
            if (i.getValue() > length) {
                ab.add(i.getKey());
            }
        }

        for (int j = 0; j < ab.size(); j++) {  
            System.out.print(ab.get(j));
        }

         
    }

    public static void main (String args [])
    {
        int nums[]={1,2};
        majorityElement(nums);
    }
}