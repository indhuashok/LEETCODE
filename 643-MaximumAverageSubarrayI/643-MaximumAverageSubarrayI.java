// Last updated: 8/11/2026, 11:24:44 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
          sum+=nums[i];
        }
        int max=sum;
         for (int i = k; i < nums.length; i++) {

            sum = sum + nums[i] - nums[i - k];

            if (sum > max) {
                max = sum;
            }
        }
        return (double)max/k;
    }
}