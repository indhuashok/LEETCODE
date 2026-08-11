// Last updated: 8/11/2026, 11:27:42 AM
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
