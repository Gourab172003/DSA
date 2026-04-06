import java.util.*;
public class hashing {
    public static void main (String [] args )
{
    HashMap<String, Integer> ab= new HashMap <>();

    ab.put("India", 100);
    ab.put("China", 90);
    ab.put("USA", 80);
    ab.put("Pakisthan", 0);

    System.out.println(ab);

    ab.put("Pakisthan", -1);
     System.out.println(ab);

    if(ab.containsKey("Thailand"))
    {
        System.out.println("present");

    }
    else {
        System.out.println("not Present");
    }

    for(Map.Entry<String,Integer> i: ab.entrySet())
    {
        System.out.print(i.getKey ());
        System.out.println(i.getValue());
    }

}

}