// Last updated: 8/11/2026, 11:26:27 AM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;

    }
}