// problem link: https://leetcode.com/problems/magnetic-force-between-two-balls/description/

class Solution {
public:
    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(), position.end());
        int l = 1, r = (position.back() - position.front()) / (m - 1) + 1, a = l;
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
    bool check(vector<int> p, int m, int c) {
        int l = 0;
        for(int i = 1; i < m; i++) {
            int n = l + 1;
            while(n < p.size() && p[n] < p[l] + c)
                n++;
            if(n == p.size())
                return false;
            l = n;
        }
        return true;
    }
};