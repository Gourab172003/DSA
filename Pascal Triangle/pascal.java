import java.util.*;
public class pascal{
    public static void main (String args[])
    {
        int n;
        System.out.println("Enter the value of n");
        Scanner Sc= new Scanner(System.in);
        n=Sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            for(int j=0; j<=i;j++)
            {
                if(j==0 || i==j)
                {
                    System.out.print(1+ " " );
                }
                else{
                     int m= (((i-1)+(j-1)) + (i-1 + j));
                   System.out.print(m + " ");
                }

                  
            }
            System.out.println();
         
        }
    }
}