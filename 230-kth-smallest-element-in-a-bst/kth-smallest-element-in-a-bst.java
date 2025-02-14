class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] result = new int[2];
        inorder(root, k, result);
        return result[1];
    }

    private void inorder(TreeNode node, int k, int[] result) {
        if (node == null) return;
        
        inorder(node.left, k, result);
        
        result[0]++;
        if (result[0] == k) {
            result[1] = node.val;
            return;
        }
        
        inorder(node.right, k, result);
    }
}
