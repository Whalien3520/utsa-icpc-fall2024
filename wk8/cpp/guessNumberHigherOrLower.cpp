// problem link: https://leetcode.com/problems/guess-number-higher-or-lower/description/

class Solution {
public:
    int guessNumber(int n) {
        int l = 1, r = n;
        while(r > l) {
            int m = l + (r - l) / 2;
            switch(guess(m)) {
                case -1:
                    r = m - 1;
                    break;
                case 0:
                    return m;
                case 1:
                    l = m + 1;
            }
        }
        return (int)l;
    }
};