// problem link: https://leetcode.com/problems/remove-linked-list-elements/description/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret = new ListNode(-1, head);
        head = ret;
        while(ret.next != null) {
            if(ret.next.val == val)
                ret.next = ret.next.next;
            else
                ret = ret.next;
        }
        return head.next;
    }
}