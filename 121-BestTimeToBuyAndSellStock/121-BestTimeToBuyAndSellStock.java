// Last updated: 8/11/2026, 11:27:49 AM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
             min=Math.min(min,prices[i]);
            int profit=prices[i]-min;
            max=Math.max(max,profit);
        }
//         int ii=0;
//       for(int i=0;i<prices.length;i++){
//         if(prices[i]<min){
//             min=prices[i];
//             ii=i;
//         }
//   }
//   if(ii==prices.length-1){
//     return 0;
//   }
//   int max=Integer.MIN_VALUE;
//     for(int i=ii+1;i<prices.length;i++){
//        if(prices[i]>max){
//         max=prices[i];
//        }
//     }
//     return max-min;
return max;
    }
}