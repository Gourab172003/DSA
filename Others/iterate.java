import java.util.HashSet;
import java.util.Iterator;          // ✅ fixed import

public class iterate              // ✅ capital H
{
    public static void main(String args[])
    {
        HashSet<Integer> ab = new HashSet<>();

        // Adding
        ab.add(1);
        ab.add(2);
        ab.add(3);
        ab.add(1);   // duplicate, won't be added

        Iterator<Integer> i = ab.iterator();  // ✅ fixed iterator
        while(i.hasNext())
        {
            System.out.println(i.next());     // ✅ prints each element
        }
    }
}