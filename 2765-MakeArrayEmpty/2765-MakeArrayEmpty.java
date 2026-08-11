// Last updated: 8/11/2026, 11:23:07 AM
import java.util.*;
class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{nums[i], i};
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        long ans = n;
        TreeSet<Integer> alive = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            alive.add(i);
        }
        for (int i = 1; i < n; i++) {
            int prev = arr[i - 1][1];
            int curr = arr[i][1];
            alive.remove(prev);
            if (curr < prev) {
                ans += alive.size();
            }
        }
        return ans;
    }
}