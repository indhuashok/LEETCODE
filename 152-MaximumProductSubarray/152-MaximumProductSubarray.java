// Last updated: 8/11/2026, 11:27:29 AM
class Solution {
    public int maxProduct(int[] nums) {
       if(nums.length==1){
        return nums[0];
       }
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
             int cur=1;
            for(int j=i;j<nums.length;j++){
                cur=cur *nums[j];
                max=Math.max(cur,max);
               
            }
            
        }
        return max;
    }
}