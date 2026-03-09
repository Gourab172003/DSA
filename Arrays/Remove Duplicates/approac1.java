import java.util.*;
public class remove{

    public static void remove(int [] arr)
    {
        Stack <Integer> A= new Stack<>();
        A.push(arr[0]);
        int i=1;
        int length=arr.length;
        while(i<length)
        {
            if(arr[i]!= A.peek())
            {
                A.push(arr[i]);
              
            }
            
             i++;
        }
        System.out.print(A.size());
    }

    public static void main (String [] args)
    {
        int arr[]={0,1,1,1,2,2,3};
        remove(arr);
    }
}