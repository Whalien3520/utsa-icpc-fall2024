// problem link: https://leetcode.com/problems/ipo/description/

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Integer[] is = new Integer[profits.length];
        for(int i = 0; i < is.length; i++)
            is[i] = i;
        Arrays.sort(is, (a, b) -> Integer.compare(capital[a], capital[b]));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> profits[b] - profits[a]);
        int i = 0;
        while(i < capital.length && capital[is[i]] <= w)
            pq.add(is[i++]);
        while(!pq.isEmpty() && k-- > 0) {
            w += profits[pq.poll()];
            while(i < capital.length && capital[is[i]] <= w)
                pq.add(is[i++]);
        }
        return w;
    }
}