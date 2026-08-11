// Last updated: 8/11/2026, 11:27:38 AM
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode root, List<Integer> result) {
        if (root == null) return;

        result.add(root.val);           // visit node
        preorder(root.left, result);    // left subtree
        preorder(root.right, result);   // right subtree
    }
}
