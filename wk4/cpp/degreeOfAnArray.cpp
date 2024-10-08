// problem link: https://leetcode.com/problems/degree-of-an-array/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        unordered_map<int, vector<int>> m;
        for(int i = 0; i < nums.size(); i++)
            m[nums[i]].push_back(i);
        int ret = INT_MAX, max = 0;
        for(auto& p : m) {
            if(p.second.size() > max) {
                max = p.second.size();
                ret = p.second.back() - p.second.front() + 1;
            }
            else if(p.second.size() == max)
                ret = min(ret, p.second.back() - p.second.front() + 1);
        }
        return ret;
    }
};