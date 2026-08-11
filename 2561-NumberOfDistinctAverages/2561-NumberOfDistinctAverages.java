// Last updated: 8/11/2026, 11:23:24 AM
class Solution {
    public int distinctAverages(int[] nums) {
        if(nums.length==2){
            return 1;
        }
        Arrays.sort(nums);
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        int j=nums.length-1;
        while (i<j){
            set.add(nums[i]+nums[j]);
           i++;
           j--;
        }
        return set.size();
    }
}