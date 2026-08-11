// Last updated: 8/11/2026, 11:25:18 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i:nums){
            
            if(i==1){
                count++;
                if(count>max){
                    max=count;
                }
            }else{
                count =0;
            }
        }
        return max;
    }
}