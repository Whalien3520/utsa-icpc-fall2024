// problem link: https://leetcode.com/problems/baseball-game/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> v;
        for(auto const &op : operations) {
            if(op[0] == '+')
                v.push_back(v[v.size() - 1] + v[v.size() - 2]);
            else if(op[0] == 'D')
                v.push_back(2 * v[v.size() - 1]);
            else if(op[0] == 'C')
                v.pop_back();
            else
                v.push_back(stoi(op));
        }
        int ret = 0;
        for(auto const &i : v)
            ret += i;
        return ret;
    }
};