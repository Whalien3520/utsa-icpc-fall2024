// problem link: https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, r = people.length - 1;
        int ret = 0;
        while(r > l) {
            if(people[r] + people[l] <= limit)
                l++;
            r--;
            ret++;
        }
        return (l == r) ? (ret + 1) : ret;
    }
}