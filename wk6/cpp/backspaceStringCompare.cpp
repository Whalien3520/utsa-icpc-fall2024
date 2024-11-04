// problem link: https://leetcode.com/problems/backspace-string-compare/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool backspaceCompare(string s, string t) {
        int sl = -1;
        for(int sr = 0; sr < s.length(); sr++) {
            if(s[sr] == '#')
                sl = max(-1, sl - 1);
            else
                s[++sl] = s[sr];
        }
        s.resize(sl + 1);
        int tl = -1;
        for(int tr = 0; tr < t.length(); tr++) {
            if(t[tr] == '#')
                tl = max(-1, tl - 1);
            else
                t[++tl] = t[tr];
        }
        t.resize(tl + 1);
        return s == t;
    }
};