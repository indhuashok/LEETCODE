// Last updated: 8/11/2026, 11:28:36 AM
class Solution {
    public int maxSubArray(int[] nums) {
       

        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currSum = Math.max(nums[i],
                               currSum + nums[i]);

            maxSum = Math.max(maxSum,
                              currSum);
        }

        return maxSum;
 
    }
}