// problem link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        vector<int> v;
        for(auto const &t : tokens) {
            if(t == "+") {
                v[v.size() - 2] = v[v.size() - 2] + v[v.size() - 1];
                v.pop_back();
            }
            else if(t == "-") {
                v[v.size() - 2] = v[v.size() - 2] - v[v.size() - 1];
                v.pop_back();
            }
            else if(t == "*") {
                v[v.size() - 2] = v[v.size() - 2] * v[v.size() - 1];
                v.pop_back();
            }
            else if(t == "/") {
                v[v.size() - 2] = v[v.size() - 2] / v[v.size() - 1];
                v.pop_back();
            }
            else
                v.push_back(stoi(t));
        }
        return v[0];
    }
};