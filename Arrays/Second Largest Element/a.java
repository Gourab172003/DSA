public class a 
{
    public static void main (String args [])
    {
        int a[]={0};
       
        
        int large1=a[0];
        int large2=Integer.MIN_VALUE;
        
        if(a[0]==1 || a[0]==0)
        {
            System.out.print(1);
        }
        else{

        for(int i=0; i<a.length; i++)
       {

        
          if(a[i]>large1 && a[i]!=large1)
          {
             large2=large1;
             large1=a[i];
          }

            else{
                if(a[i]<large1 && a[i]>large2)
                {
                    large2=a[i];
                }
            }
          }

          System.out.print(large2);
       }
    }
       
    }
