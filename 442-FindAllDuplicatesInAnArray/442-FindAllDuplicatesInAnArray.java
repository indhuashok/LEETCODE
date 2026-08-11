// Last updated: 8/11/2026, 11:25:35 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                ll.add(Math.abs(nums[i]));
            }else{
                nums[index]  = nums[index] * -1;
            }
        } 
        return ll;
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  