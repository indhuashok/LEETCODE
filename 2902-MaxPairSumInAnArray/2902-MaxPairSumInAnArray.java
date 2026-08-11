// Last updated: 8/11/2026, 11:23:04 AM
class Solution {
    public int gre(int n){
        int high=0;
        while(n>0){
            high=Math.max(high,n%10);
            n=n/10;
        }
        return high;

    }
    public int maxSum(int[] nums) {
        int max[]=new int[10];
        Arrays.fill(max,-1);
        int ans=-1;
        for(int num:nums){
            int lar=gre(num);
            if(max[lar]!= -1){
              ans=Math.max(ans,num+max[lar]);
            }
            max[lar]=Math.max(max[lar],num);
        }
        return ans;
    }
}