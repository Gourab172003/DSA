class Solution {
    public boolean judgeCircle(String moves) {

        int L=moves.length();
        if(L%2 != 0)
        {
            return false ;
        }
        int u=0;
        int d=0;
        int l=0;
        int r=0;

int i=0;
        while(i<L)
        {
          if(moves.charAt(i)=='L')
          {
            l++;
            i++;
          }
          else if(moves.charAt(i)=='R')
          {
            r++;
            i++;
          }
         else if(moves.charAt(i)=='U')
          {
            u++;
            i++;
          }
         else if(moves.charAt(i)=='D')
          {
            d++;
            i++;
          }
        }

        if(l-r == 0 && u-d==0)
        {
            return true;
        }
        return false;
        
    }
}