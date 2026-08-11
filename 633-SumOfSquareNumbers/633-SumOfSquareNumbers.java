// Last updated: 8/11/2026, 11:24:47 AM
class Solution {
    public boolean judgeSquareSum(int c) {
         long sum=0;
        //     for(int i=1;i<=c;i++){
        //        sum=sum+(i*i);
        //         if(sum==c){
        //             return true;
        //         }   
        // }
        // return false;
       long left=0;
        long right=(long)Math.sqrt(c);
        while(left<=right){
            sum=left*left+right*right;
            if(sum==c){
                return true;
            }
            if(sum<c){
                left++;
            }
            if(sum>c){
                right--;
            }
        }
        return false;
    }
}