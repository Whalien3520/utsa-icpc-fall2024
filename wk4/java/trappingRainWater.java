// problem link: https://leetcode.com/problems/trapping-rain-water/description/

class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1, lmax = height[l], rmax = height[r], ret = 0;
        while (l < r) {
            if(lmax < rmax) {
                l++;
                lmax = Math.max(lmax, height[l]);
                ret += lmax - height[l];
            }
            else {
                r--;
                rmax = Math.max(rmax, height[r]);
                ret += rmax - height[r];
            }
        }
        return ret;
    }
}