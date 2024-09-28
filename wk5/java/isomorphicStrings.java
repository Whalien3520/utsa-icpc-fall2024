// problem link: https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] st = new int[128], ts = new int[128];
        Arrays.fill(st, -1);
        Arrays.fill(ts, -1);
        for(int i = 0; i < s.length(); i++) {
            if(st[s.charAt(i)] == -1)
                st[s.charAt(i)] = t.charAt(i);
            else if(st[s.charAt(i)] != t.charAt(i))
                return false;
            if(ts[t.charAt(i)] == -1)
                ts[t.charAt(i)] = s.charAt(i);
            else if(ts[t.charAt(i)] != s.charAt(i))
                return false;
        }
        return true;
    }
}