// Last updated: 8/11/2026, 11:25:10 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        int a=num;
     for(int i=1;i<num;i++){
        if(num %i==0){
            s+=i;
        }
     }
     if(a==s){
        return true;
     }else{
        return false;
     }
    }
}