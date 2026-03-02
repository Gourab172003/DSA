import java.util.*;
public class AA
{
    public static void Reverse(Deque<Integer>AB, int target)
    {
      int i=0;
      Deque<Integer>A= new LinkedList<>();
      while(i!=target)
      {
        A.add(AB.removeFirst());
        i++;
      }

      while(!A.isEmpty())
      {
        AB.addFirst(A.remove());
      }

      System.out.print(AB);
    }

    public static void main (String [] args)
    {
      Deque<Integer> AB= new LinkedList <>();
      AB.addLast(10);
      AB.addLast(20);
      AB.addLast(30);
      AB.addLast(40);
      AB.addLast(50);
      AB.addLast(60);
      AB.addLast(70);
      AB.addLast(80);
      AB.addLast(90);
      AB.addLast(100);
      int target= 5;
      Reverse(AB,target);

    }
}
