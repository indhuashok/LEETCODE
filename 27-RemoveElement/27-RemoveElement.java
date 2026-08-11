// Last updated: 8/11/2026, 11:29:01 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int j=0;
        for(int i=0;i<n;i++){
           if(nums[i]!=val){
            nums[j]=nums[i];
            j++;
           }
        //    }else{
            
        //     j++;
        //    }
        }
        return j;
    }
}