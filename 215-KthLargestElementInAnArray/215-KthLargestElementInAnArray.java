// Last updated: 8/11/2026, 11:27:01 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Set<Integer> set=new TreeSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // int arr[]=new int[set.size()];
        // int i=0;
        // for(int j:set){
        //     arr[i++]=j;
        // }
        // int a=0;
        // for(int m=1;m<=arr.length;m++){
        //     a++;
        //     if(a==k){
        //         return arr[m];
        //     }
        // }
        // return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.offer(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}