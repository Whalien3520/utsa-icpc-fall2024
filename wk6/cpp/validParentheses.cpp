// problem link: https://leetcode.com/problems/valid-parentheses/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        vector<char> st;
        for(auto const &c : s) {
            if(c == '(' || c == '{' || c == '[')
                st.push_back(c);
            else {
                if(st.empty() || 
                    (c == ')' && st.back() != '(') ||
                    (c == '}' && st.back() != '{') ||
                    (c == ']' && st.back() != '['))
                        return false;
                st.pop_back();
            }
        }
        return st.size() == 0;
    }
};