public class checkithbit
{
    public static void main (String args [])
    {
        int n=16;
        int p=2;
        if((n & (1<<2))!=0)
        {
            System.out.print( "True");
        }
        else {
            System.out.print("False");
        }
    }
}