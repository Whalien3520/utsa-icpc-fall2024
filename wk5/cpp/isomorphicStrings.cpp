// problem link: https://leetcode.com/problems/isomorphic-strings/description/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int st[1 << 8], ts[1 << 8];
        fill(st, st + (1 << 8), -1);
        fill(ts, ts + (1 << 8), -1);
        for(int i = 0; i < s.size(); i++) {
            if(st[s[i]] == -1)
                st[s[i]] = t[i];
            else if(st[s[i]] != t[i])
                return false;
            if(ts[t[i]] == -1)
                ts[t[i]] = s[i];
            else if(ts[t[i]] != s[i])
                return false;
        }
        return true;
    }
};