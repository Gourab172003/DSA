import java.util.*;
public class union {
    public static void main (String args [])
    {
        int a[]={7,3,9};
        int b[]={6,3,9,2,9,4};

        HashSet<Integer>ab= new HashSet <>();

        for(int i=0; i<a.length;i++)
        {
            ab.add(a[i]);
        }

        for(int j=0;j<b.length;j++)
        {
            ab.add(b[j]);
        }

        System.out.print(ab);
    }
}