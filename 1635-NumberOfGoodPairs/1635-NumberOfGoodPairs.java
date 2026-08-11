// Last updated: 8/11/2026, 11:24:00 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        if(c>0){
            return c;
        }else{
            return 0;
        }
    }
}