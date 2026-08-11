// Last updated: 8/11/2026, 11:26:17 AM
class Solution {
    public boolean canWinNim(int n) {
        // if(n<=3){
        //     return true;
        // }else{
        //     while(n>=4){
        //         n=n-3;
        //     }
        //         if(n<3){
        //             return false;
        //         }else{
            
        //     return true;
        //         }
        // }
        if(n%4!=0){
            return true;
        }else{
            return false;
        }
    }
}