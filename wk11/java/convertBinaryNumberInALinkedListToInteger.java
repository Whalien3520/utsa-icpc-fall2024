// problem link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

class Solution {
    public int getDecimalValue(ListNode head) {
        int i = 0;
        while(head != null) {
            i = (i << 1) + head.val;
            head = head.next;
        }
        return i;
    }
}