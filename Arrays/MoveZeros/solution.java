public class solution{
    public static void main (String [] args)
    {
        int a[]={0,1,0,3,12};
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
            {
                int temp=a[k];
                a[k]=a[i];
                a[i]=temp;
                k++;
            }
            
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}