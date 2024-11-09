// problem link: https://leetcode.com/problems/merge-k-sorted-lists/description/

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists)
            if (node != null)
                pq.add(node);
        if(pq.isEmpty())
            return null;
        ListNode ret = new ListNode(-1), iter = ret;
        while(!pq.isEmpty()) {
            iter.next = pq.poll();
            iter = iter.next;
            if(iter.next != null)
                pq.add(iter.next);
        }
        return ret.next;
    }
}