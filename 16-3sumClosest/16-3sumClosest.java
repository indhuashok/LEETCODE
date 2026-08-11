// Last updated: 8/11/2026, 11:29:15 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int t=target;
        int maxsum=0;
        Integer sum1=null;
        Integer sum2=null;
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                if(k>=n) continue;
        
                
               maxsum=nums[i]+nums[j]+nums[k];
               
               if(maxsum<t ){
                if(sum1==null || maxsum > sum1 ){
                sum1=maxsum;
                }
               }else if(maxsum>t ){
                if(sum2==null || maxsum < sum2){
                sum2=maxsum;
               }
               }
            else{
                return maxsum;
            }
            }
            }
        }
        if(sum1==null ){
             return sum2;
        }else if(sum2==null){
            return sum1;
        }
        int dif1=t-sum1;
        int dif2=sum2-t;
        if(dif1<dif2){
            return sum1;
        }else{
            return sum2;
        }
    }
}