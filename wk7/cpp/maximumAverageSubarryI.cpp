// problem link: https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double cur = 0;
        for(int i = 0; i < k; i++)
            cur += nums[i];
        double m = cur;
        for(int i = 0; i < nums.size() - k; i++) {
            cur += nums[i + k] - nums[i];
            m = max(cur, m);
        }
        return m / k;
    }
};