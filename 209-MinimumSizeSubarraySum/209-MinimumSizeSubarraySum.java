// Last updated: 8/11/2026, 11:27:04 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int i=0;i<n;i++){
        //     int sum=0;
             
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             min=Math.min(min,j-i+1);
        //             break;
        //         }
        //     }
        // }
        // if(min==Integer.MAX_VALUE){
        //     return 0;
        // }else{
        // return min;
        // }
        sum+=nums[i];
        while(sum>=target){
            min=Math.min(min,i-left+1);
            sum-=nums[left];
            left++;
        }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }else{
        return min;
        }
    }
}