// problem link: https://leetcode.com/problems/reverse-string/description/

class Solution {
public:
    void reverseString(vector<char>& s) {
        int l = 0, r = s.size() - 1;
        while(l < r) {
            char c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
};