// Last updated: 8/11/2026, 11:28:03 AM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode root, List<Integer> ans) {
        if (root == null) return;

        inorder(root.left, ans);   // left
        ans.add(root.val);         // node
        inorder(root.right, ans);  // right
    }
}
