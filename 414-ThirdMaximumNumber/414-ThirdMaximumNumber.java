// Last updated: 8/11/2026, 11:25:41 AM
class Solution {
     public int a(int arr[]){
             if(arr.length ==1){
            return arr[0];
        }
        if(arr.length==2){
            Arrays.sort(arr);
            
        }
        return arr[arr.length-1];
        }
    public int thirdMax(int[] nums) {
        if(nums.length ==1){
            return nums[0];
        }
        if(nums.length==2){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        Set<Integer>a= new HashSet<>();
        for(int i:nums){
           a.add(i);
        }
        int in=0;
        int arr[]=new int[a.size()];
        for(int i:a){
            arr[in++]=i;
        }
        Arrays.sort(arr);
        if(arr.length <=2){
            return a(arr);
        }
       
        return arr[arr.length-3];
    }
}