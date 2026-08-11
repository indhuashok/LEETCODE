// Last updated: 8/11/2026, 11:23:02 AM
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long res=0;
        while(n>0){
            long rem=n%10;
            if(rem>0){
            sum+=rem;
            res=res*10+rem;
            }
            n=n/10;
        }
        long a=0;
        while(res>0){
            long rem=res%10;
           a=a*10+rem;
           res=res/10;
        }
        return (long)(sum*a);
        
    }
}