import java.util.*;
public class TwoSum{

    public static void main (String args [])
    {
        int a[]= {3,2,4};
        int target=6;
        int b[]= new int[2];

        HashMap<Integer, Integer> ab= new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            int check=target-a[i];
            if(ab.containsKey(check))
            {
                b[1]=i;
                b[0]=ab.get(check);
            }

            else{
                ab.put(a[i], i);
            }
        }

        for(int j=0;j<b.length;j++)
        {
            System.out.print(b[j] + " ");
        }
    }
}