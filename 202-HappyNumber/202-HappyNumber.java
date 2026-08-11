// Last updated: 8/11/2026, 11:27:15 AM
class Solution {
    public boolean isHappy(int n) {
     
        while(n!=1 && n!=4){
            int sq=0;
            while(n>0){
            int temp=n%10;
            sq=sq+(temp*temp);
            n=n/10;  
            }
            n=sq;
        }
       
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}