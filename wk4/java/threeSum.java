// problem link: https://leetcode.com/problems/3sum/description/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i-1])
                continue;
            else {
                int j = i + 1, k = nums.length - 1;
                while(j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum > 0)
                        k--;
                    else if (sum < 0)
                        j++;
                    else {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        ret.add(temp);
                        j++;
                        while(j < nums.length && nums[j] == nums[j-1])
                            j++;
                    }
                }
            }
        }
        return ret;
    }
}