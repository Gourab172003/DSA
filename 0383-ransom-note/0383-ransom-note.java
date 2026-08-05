class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ab = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
        {
            if (ab.containsKey(magazine.charAt(i)))
            {
                ab.put(magazine.charAt(i), ab.get(magazine.charAt(i)) + 1);
            }
            else 
            {
                ab.put(magazine.charAt(i), 1);
            }
        }

        for (int j = 0; j < ransomNote.length(); j++)
        {
            char c = ransomNote.charAt(j);
            if (ab.containsKey(c) && ab.get(c) != 0)
            {
                ab.put(c, ab.get(c) - 1);
            }
            else 
            {
                return false; 
            }
        }

        return true;
    }
}