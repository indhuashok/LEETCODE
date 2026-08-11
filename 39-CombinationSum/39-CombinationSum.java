// Last updated: 8/11/2026, 11:28:47 AM
import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, 0, new ArrayList<>());
        return ans;
    }
    private void dfs(int[] candidates, int target, int start, List<Integer> curr) {
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target)
                continue;
            curr.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, curr);
            curr.remove(curr.size() - 1);
        }
    }
}