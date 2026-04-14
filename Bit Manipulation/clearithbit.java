public class clearithbit
{
    public static void main (String [] args )
    {
        int n=13;
        int result=n & ~(1<<2);
        System.out.print(result);
    }
}