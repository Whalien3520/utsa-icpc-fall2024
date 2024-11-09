// problem link: https://leetcode.com/problems/remove-nodes-from-linked-list/description/

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode n = null, t = null;
        while(head != null) {
            t = head.next;
            head.next = n;
            n = head;
            head = t;
        }
        t = n;
        while(t.next != null) {
            if(t.val > t.next.val)
                t.next = t.next.next;
            else
                t = t.next;
        }
        t = t.next;
        while(n != null) {
            t = n.next;
            n.next = head;
            head = n;
            n = t;
        }
        return head;
    }
}