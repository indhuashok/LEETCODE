// Last updated: 8/11/2026, 11:23:17 AM
class Solution {
    public int distinctIntegers(int n) {
        int x=0;
       if(n>2){
        if(n% (n-1) ==1){
            x=n-1;
        }
        }else if(n==1 || n==2){
            return 1;
        }
       
       return x;
    }
}