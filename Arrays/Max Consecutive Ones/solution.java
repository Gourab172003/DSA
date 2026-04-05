public class solution
{
    public static void main (String args [])
    {
        int a[]={1,0,1,1,0,1};
        int c=1;
        int f=c;
        int check=0;
        while(check!=a.length-1)
        {
            if(a[check]==a[check+1])
            {
                 c++;
                f=c;
               

                if(f<c)
                {
                    f=c;
                }
            }

            else{
                c=1;
            }

            check ++;
        }

        System.out.print(f);
    }
}