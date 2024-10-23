// problem link: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while(l < r) {
            int m = (l + r) / 2;
            if(arr[m] < arr[m + 1])
                l = m + 1;
            else if(arr[m] < arr[m - 1])
                r = m - 1;
            else
                return m;
        }
        return l;
    }
}