// Last updated: 8/11/2026, 11:23:54 AM
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;  // start positive
        for (int num : nums) {
            if (num == 0) return 0;   // zero makes product zero
            if (num < 0) sign = -sign; // flip sign for each negative
        }
        return sign;
    }
}
