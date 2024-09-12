// problem link: https://leetcode.com/problems/custom-sort-string/description/

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ind = 0;
        for(char c : order.toCharArray())
            map.put(c, ind++);
        for(char c : s.toCharArray())
            if(!map.containsKey(c))
                map.put(c, -1);
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(char c : s.toCharArray())
            pq.add(c);
        String ret = "";
        while(!pq.isEmpty())
            ret += pq.poll();
        return ret;
    }
}