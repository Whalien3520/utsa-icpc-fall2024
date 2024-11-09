// problem link: https://leetcode.com/problems/merge-two-sorted-lists/description/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ret = new ListNode(-1), p = ret;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            }
            else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        if(list1 != null)
            p.next = list1;
        else
            p.next = list2;
        return ret.next;
    }
}