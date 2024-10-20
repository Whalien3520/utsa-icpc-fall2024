// problem link: https://leetcode.com/problems/find-the-number-of-good-pairs-ii/description/

class Solution {
public:
    long long numberOfPairs(vector<int>& nums1, vector<int>& nums2, int k) {
        unordered_map<int, int> m;
        for(auto n : nums2) {
            if(!m.count(n * k))
                m[n * k] = 1;
            else
                m[n * k]++;
        }
        long ret = 0;
        for(int i : nums1) {
            for(int j = 1; j * j <= i; j++) {
                if(i % j != 0)
                    continue;
                ret += m.count(j) ? m[j] : 0;
                if(j != i / j)
                    ret += m.count(i / j) ? m[i / j] : 0;
            }
        }
        return ret;
    }
};