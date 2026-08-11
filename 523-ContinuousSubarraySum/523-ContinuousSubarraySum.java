// Last updated: 8/11/2026, 11:25:03 AM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
          int n=nums.length;
          HashMap<Integer,Integer>map=new HashMap<>();
        //   for(int i=0;i<n;i++){
        //     int sum=0;
        //   //  int arr[]=new int[n];
        //    // int a=0;
        //     for(int j=i;j<n;j++){
        //         //for(int l=i;l<=j;l++){
        //              sum+=nums[j];
        //    // }
        //      if( (j-i+1)>=2 ){
        //         if((k==0 && sum==0) || sum%k==0){
        //         return true;
        //         }
        //     }
        //     }
           
        //   }
        //   return false;
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
           int rem=sum%k;
           if(map.containsKey(rem)){
            if(i-map.get(rem)>=2){
                return true;
            }
           }else{
            map.put(rem,i);
           }
        }
        return false;
    }
}