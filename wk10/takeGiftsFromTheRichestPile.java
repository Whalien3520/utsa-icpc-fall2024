// problem link: https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int gift : gifts)
            pq.add(gift);
        while(k-- > 0)
            pq.add((int)Math.floor(Math.sqrt(pq.poll())));
        long ret = 0;
        while(!pq.isEmpty())
            ret += pq.poll();
        return ret;
    }
}