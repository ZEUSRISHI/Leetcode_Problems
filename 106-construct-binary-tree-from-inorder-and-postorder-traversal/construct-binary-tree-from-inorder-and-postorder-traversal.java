import java.util.*;

class Solution {
    private Map<Integer, Integer> inorderMap;
    private int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderMap = new HashMap<>();
        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return constructTree(postorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] postorder, int left, int right) {
        if (left > right) return null;

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        int inorderIndex = inorderMap.get(rootVal);

        root.right = constructTree(postorder, inorderIndex + 1, right);
        root.left = constructTree(postorder, left, inorderIndex - 1);

        return root;
    }
}
