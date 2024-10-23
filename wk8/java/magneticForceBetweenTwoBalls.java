// problem link: https://leetcode.com/problems/magnetic-force-between-two-balls/description/

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1, r = (position[position.length - 1] - position[0]) / (m - 1) + 1, a = l;
        while(l <= r) {
            int c = (l + r) / 2;
            if(check(position, m, c)) {
                a = c;
                l = c + 1;
            }
            else
                r = c - 1;
        }
        return a;
    }
    private boolean check(int[] p, int m, int c) {
        int l = 0;
        for(int i = 1; i < m; i++) {
            int n = l + 1;
            while(n < p.length && p[n] < p[l] + c)
                n++;
            if(n == p.length)
                return false;
            l = n;
        }
        return true;
    }
}