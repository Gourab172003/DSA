import java.util.HashSet;


public class hashSheet
{
    public static void main (String args [])
    {
       HashSet<Integer> ab= new HashSet <>();

       //Adding 
       ab.add(1);
       ab.add(2);
       ab.add(3);
       ab.add(1);

       //Searching
       boolean ans= ab.contains(6);
       System.out.print(ans);

       //Delete
       ab.remove(3);

       System.out.println(ab);

    }
}