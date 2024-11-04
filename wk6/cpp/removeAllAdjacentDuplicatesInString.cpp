// problem link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string removeDuplicates(string s) {
        int l = -1;
        for(int r = 0; r < s.length(); r++) {
            if(l == -1 || s[l] != s[r])
                s[++l] = s[r];
            else
                l--;
        }
        s.resize(l + 1);
        return s;
    }
};