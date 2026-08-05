class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> ab = new ArrayList<>();
        HashMap<Integer, Integer> bc = new HashMap<>();

        for (int i = 0; i < nums1.length; i++)
        {
            bc.put(nums1[i], 1);
        }

        for (int j = 0; j < nums2.length; j++)
        {
            if (bc.containsKey(nums2[j]) && bc.get(nums2[j]) == 1)
            {
                ab.add(nums2[j]);
                bc.put(nums2[j], 0);
            }
        }

        int result[] = new int[ab.size()];
        for (int i = 0; i < ab.size(); i++)
        {
            result[i] = ab.get(i); 
        }

        return result;
    }
}