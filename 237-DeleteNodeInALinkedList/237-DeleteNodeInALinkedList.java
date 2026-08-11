// Last updated: 8/11/2026, 11:26:45 AM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;      // copy next node's value
        node.next = node.next.next;    // skip next node
    }
}
