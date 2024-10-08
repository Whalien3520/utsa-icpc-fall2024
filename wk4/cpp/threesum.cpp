// problem link: https://leetcode.com/problems/3sum/description/

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(begin(nums), end(nums));
        vector<vector<int>> ret;
        for(int i = 0; i < nums.size() - 2; i++) {
            if(i && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = nums.size() - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0)
                    k--;
                else if(sum < 0)
                    j++;
                else {
                    vector<int> temp = {nums[i], nums[j], nums[k]};
                    ret.push_back(temp);
                    j++;
                    while(j < nums.size() && nums[j] == nums[j - 1])
                        j++;
                }
            }
        }
        return ret;
    }
};