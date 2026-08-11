// Last updated: 8/11/2026, 11:27:27 AM
class Solution {
    public int findMin(int[] nums) {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
       } 
       return min;
    }
}