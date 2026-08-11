// Last updated: 8/11/2026, 11:23:30 AM
// class Solution {
//     public long zeroFilledSubarray(int[] nums) {
//         long c=0;
//         for(int i=0;i<nums.length;i++){
//              boolean f=true;
//             for(int j=i;j<nums.length;j++){
//                 for(int k=i;k<=j;k++){
//                     if(nums[k]!=0){
//                         f=false;
//                         break;
//                     }
//                     } if(f){
//                     c++;
//                 } 
//             }   
//         }
//         return c;
//     }
// }
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }

        return ans;
    }
}