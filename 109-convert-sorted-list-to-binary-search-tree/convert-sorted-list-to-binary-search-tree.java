class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return convertToBST(head, null);
    }
    
    private TreeNode convertToBST(ListNode head, ListNode tail) {
        if (head == tail) return null;
        
        ListNode slow = head, fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        root.left = convertToBST(head, slow);
        root.right = convertToBST(slow.next, tail);
        
        return root;
    }
}
