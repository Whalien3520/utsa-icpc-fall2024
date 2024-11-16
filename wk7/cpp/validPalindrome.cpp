// problem link: https://leetcode.com/problems/valid-palindrome/description/

class Solution {
public:
    bool isPalindrome(string s) {
        int f = 0, b = s.size() - 1;
        while(f < b) {
            if(!isalpha(s[f]) && !isdigit(s[f]))
                f++;
            else if(!isalpha(s[b]) && !isdigit(s[b]))
                b--;
            else {
                if(tolower(s[f]) != tolower(s[b]))
                    return false;
                f++;
                b--;
            }
        }
        return true;
    }
};