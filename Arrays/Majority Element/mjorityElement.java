import java.util.*;
public class mjorityElement
{
    public static void main (String args [])
    {
        int []a={2,2,1,1,1,2,2};
        int n=a.length/2;
        HashMap<Integer, Integer>ab= new HashMap<>();

        for(int i=0;i<a.length; i++)
        {
            if(ab.containsKey(a[i]))
            {
                ab.put(a[i], ab.get(a[i])+1);
            }
            else {
                ab.put(a[i],1);
            }
        }

        for(Map.Entry<Integer, Integer> i : ab.entrySet())
        {
            if(i.getValue()>n)
            {
                System.out.print(i.getKey());
            }
        }
    }

}