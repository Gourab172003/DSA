import java.util.*;
public class AA
{

public static void generateBinary(int target)
{
  Queue<String>AB= new LinkedList<>();
  AB.add("1");
  while(target>0)
  {
     String s1= AB.peek();
     AB.remove();
     String s2=s1;
     System.out.println(s1);
     AB.add(s1+ "0");
     AB.add(s2+ "1");
     target--;
  }
  
}


  public static void main (String args [])
  {
    int target=10;
    generateBinary(target);
  }
}
