// Last updated: 8/11/2026, 11:23:19 AM
class Solution {
    public int differenceOfSum(int[] nums) {
       int diff=0;
       int s1=0;
       int s2=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
          s1+=nums[i];
       } 
       int s=0;
       for(int i=0;i<nums.length;i++){
          int n = nums[i];
            if (n >= 10) {   
                while (n > 0) {
                  int r=n%10;
                   s+=r;
                  n=n/10;
                }
         }else{
            s2+=nums[i];
         }
         sum=s+s2;
       }
       
      diff=s1-sum;
      return diff;
    }
}