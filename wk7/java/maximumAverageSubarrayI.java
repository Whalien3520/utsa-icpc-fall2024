// problem link: https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cur = 0;
        for(int i = 0; i < k; i++)
            cur += nums[i];
        int max = cur;
        for(int i = 0; i < nums.length - k; i++) {
            cur -= nums[i];
            cur += nums[i + k];
            max = Math.max(max, cur);
        }
        return (double)max / k;
    }
}