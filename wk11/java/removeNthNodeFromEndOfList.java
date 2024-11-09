// problem link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ret = new ListNode(-1, head), s = ret;
        while(n-- > 0)
            head = head.next;
        while(head != null) {
            head = head.next;
            s = s.next;
        }
        s.next = s.next.next;
        return ret.next;
    }
}