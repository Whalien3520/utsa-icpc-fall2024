// problem link: https://leetcode.com/problems/trapping-rain-water/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int l = 0, r = height.size() - 1, lmax = height[l], rmax = height[r], ret = 0;
        while(l < r) {
            if(lmax < rmax) {
                l++;
                lmax = max(lmax, height[l]);
                ret += lmax - height[l];
            }
            else {
                r--;
                rmax = max(rmax, height[r]);
                ret += rmax - height[r];
            }
        }
        return ret;
    }
};