class powerofTwo
{
    public static void main (String [] args )
    {
        int n=18;
        if((n & (n-1))==0)
        {
            System.out.print("true");
        }
        else {
            System.out.print("False");
        }

    }
}