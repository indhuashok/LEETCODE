// Last updated: 8/11/2026, 11:26:48 AM
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // 1. Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode secondHalf = reverseList(slow.next);

        // 3. Compare halves
        ListNode firstHalf = head;
        ListNode tempSecond = secondHalf;
        boolean palindrome = true;
        while (tempSecond != null) {
            if (firstHalf.val != tempSecond.val) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }

        // 4. Optional: restore the list
        slow.next = reverseList(secondHalf);

        return palindrome;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
