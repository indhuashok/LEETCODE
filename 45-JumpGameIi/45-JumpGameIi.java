// Last updated: 8/11/2026, 11:28:43 AM
class Solution {
    public int jump(int[] nums) {
        int c=0;
        int curr=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,i+nums[i]);
            if(i==curr){
                c++;
                curr=far;
            }
        }
        return c;
    }
}