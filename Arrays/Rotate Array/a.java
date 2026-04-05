public class a
{
    public static void main (String args [])
    {
        int a[]={1,2,3,4,5};
        int mid=Math.abs(a.length/2);
        
        int fst=0;
        int lst=a.length-1;
        int temp=0;

        while(fst<lst)
        {temp=a[fst];
            a[fst]=a[lst];
            a[lst]=temp;
            fst++;
            lst--;
            


        }
        int tar=3;
        int Sfst=0;
        int Slst=tar-1;
        int c=0;
        int Stemp=0;
        
        while(Slst>Sfst && c<=tar-1)
        {
            Stemp=a[Sfst];
            a[Sfst]=a[Slst];
            a[Slst]=Stemp;
            Sfst++;
            Slst--;
            c++;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}