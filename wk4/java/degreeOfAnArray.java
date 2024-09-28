// problem link: https://leetcode.com/problems/degree-of-an-array/description/

class Solution {
    public int findShortestSubArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        //l.add(nums[0]);
        HashMap<Integer, Integer> c = new HashMap<>(), l = new HashMap<>(), r = new HashMap<>();
        int max = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(!c.containsKey(nums[i])) {
                c.put(nums[i], 1);
                l.put(nums[i], i);
            }
            else
                c.put(nums[i], c.get(nums[i]) + 1);
            r.put(nums[i], i);
            if(c.get(nums[i]) > max) {
                max++;
                list = new ArrayList<>();
                list.add(nums[i]);
                min = r.get(nums[i]) - l.get(nums[i]) + 1;
            }
            else if(c.get(nums[i]) == max) {
                list.add(nums[i]);
                min = Math.min(min, r.get(nums[i]) - l.get(nums[i]) + 1);
            }
        }
        return min;
    }
}