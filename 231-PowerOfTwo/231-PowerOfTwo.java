// Last updated: 8/11/2026, 11:26:50 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        // int a=0;
        // for(int i=0;i<n;i++){
            
        //       a=(int)Math.pow(2,i);
        //       if(a==n){
        //         return true;
        //       }
        // }
        // return false;
      
        if(n<0 || n==0){
            return false;
        }
   
        while(n%2==0){
          n=n/2;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}