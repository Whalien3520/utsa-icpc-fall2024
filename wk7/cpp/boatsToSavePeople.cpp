// problem link: https://leetcode.com/problems/boats-to-save-people/description/

class Solution {
public:
    int numRescueBoats(vector<int>& people, int limit) {
        sort(people.begin(), people.end());
        int l = 0, r = people.size() - 1, ret = 0;
        while(r >= l) {
            if(people[r] + people[l] <= limit)
                l++;
            r--;
            ret++;
        }
        return ret;
    }
};