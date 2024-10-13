// problem link: https://leetcode.com/problems/reverse-string/description/

class Solution {
    public void reverseString(char[] s) {
        char c;
        int l = 0, r = s.length - 1;
        while(l < r) {
            c = s[l];
            s[l++] = s[r];
            s[r--] = c;
        }
    }
}