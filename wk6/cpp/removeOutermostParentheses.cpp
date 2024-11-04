// problem link: https://leetcode.com/problems/remove-outermost-parentheses/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string removeOuterParentheses(string s) {
        int l = 0, c = 0;
        for(int r = 0; r < s.length(); r++) {
            if(c == 0)
                c++;
            else if(c == 1 && s[r] == ')')
                c--;
            else {
                c += (s[r] == '(' ? 1 : -1);
                s[l++] = s[r];
            }
        }
        s.resize(l);
        return s;
    }
};