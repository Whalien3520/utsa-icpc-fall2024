// problem link: https://leetcode.com/problems/binary-search/description/

class Solution {
public:
    int search(vector<int>& nums, int target) {
        int l = 0, r = nums.size() - 1;
        while(l < r) {
            int m = (l + r) / 2;
            if(target == nums[m])
                return m;
            if(target > nums[m])
                l = m + 1;
            else
                r = m;
        }
        if(l < nums.size() && target == nums[l])
            return l;
        return -1;
    }
};