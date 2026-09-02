// Last updated: 9/2/2026, 2:09:26 PM
1import java.util.Arrays;
2
3class Solution {
4    public int arrayPairSum(int[] nums) {
5
6        Arrays.sort(nums);
7
8        int sum = 0;
9
10        for (int i = 0; i < nums.length; i += 2) {
11            sum += nums[i];
12        }
13
14        return sum;
15    }
16}