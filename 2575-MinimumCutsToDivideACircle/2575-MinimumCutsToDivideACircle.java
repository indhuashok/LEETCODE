// Last updated: 8/11/2026, 11:23:22 AM
class Solution {
    public int numberOfCuts(int n) {
       if(n%2==0){
        int a=n/2;
        return a;
       } else  if(n==0){
            return 0;
        }else if(n==1){
          return 0;
        }
        else{
         return n;
       }
    }
}