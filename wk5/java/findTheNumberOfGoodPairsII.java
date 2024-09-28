// problem link: https://leetcode.com/problems/find-the-number-of-good-pairs-ii/description/

class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums2) {
            if(!map.containsKey(n * k))
                map.put(n * k, 1);
            else
                map.put(n * k, map.get(n * k) + 1);
        }
        long ret = 0;
        for(int i : nums1) {
            for(int j = 1; j * j <= i; j++) {
                if(i % j != 0)
                    continue;
                ret += map.containsKey(j) ? map.get(j) : 0;
                if(j != i / j)
                    ret += map.containsKey(i / j) ? map.get(i / j) : 0;
            }
        }
        return ret;
    }
}