public class missing
{
    public static void main (String [] args)
    {
        int arr[]=new int[3];
        arr[0]=3;
        arr[1]=0;
        arr[2]=1;

        System.out.print(missingElement(arr));
    }
    

    public static int missingElement(int [] arr)
    {
        int XOR= arr.length;
        for (int i = 0; i < arr.length; i++) {
            
            XOR= XOR ^ i ^ arr[i];
            // XOR= XOR ^ arr[i];
        }
        return XOR;
    }
    
}