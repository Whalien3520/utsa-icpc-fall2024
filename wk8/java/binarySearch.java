// problem link: https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while(l < h) {
            int m = (l + h) / 2;
            if(target == nums[m])
                return m;
            if(target > nums[m])
                l = m + 1;
            else
                h = m;
        }
        if(l < nums.length && target == nums[l])
            return l;
        return -1;
    }
}