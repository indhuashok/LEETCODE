// Last updated: 8/11/2026, 11:23:44 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0;
        int rev2=0;
        
        int a=num;
        while(num>0){
         rev1=rev1*10+(num%10);
         num=num/10;
        }
        int k=rev1;
        while(rev1>0){
            rev2=rev2*10+(rev1%10);
            rev1=rev1/10;
        }
        int m=rev2;
     if(a==m){
        return true;
     }else{
        return false;
     }
    }
}