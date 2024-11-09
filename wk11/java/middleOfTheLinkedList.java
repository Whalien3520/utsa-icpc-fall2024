// problem link: https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ret = head, f = head;
        while(f != null && f.next != null) {
            ret = ret.next;
            f = f.next.next;
        }
        return ret;
    }
}