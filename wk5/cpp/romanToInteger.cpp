// problem link: https://leetcode.com/problems/roman-to-integer/description/

class Solution {
public:
    int romanToInt(string s) {
        int ret = 0;
        for(int i = 0; i < s.size(); i++) {
            switch(s[i]) {
                case 'V':
                    ret += 5;
                    break;
                case 'L':
                    ret += 50;
                    break;
                case 'D':
                    ret += 500;
                    break;
                case 'M':
                    ret += 1000;
                    break;
                case 'I':
                    if(i + 1 < s.length() && (s[i + 1] == 'V' || s[i + 1] == 'X'))
                        ret -= 1;
                    else
                        ret += 1;
                    break;
                case 'X':
                    if(i + 1 < s.length() && (s[i + 1] == 'L' || s[i + 1] == 'C'))
                        ret -= 10;
                    else
                        ret += 10;
                    break;
                case 'C':
                    if(i + 1 < s.length() && (s[i + 1] == 'D' || s[i + 1] == 'M'))
                        ret -= 100;
                    else
                        ret += 100;
                    break;
            }
        }
        return ret;
    }
};