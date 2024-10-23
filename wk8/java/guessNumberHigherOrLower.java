// problem link: https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long l = 1, r = n;
        while(r > l) {
            int m = (int)((l + r) / 2);
            switch(guess((int)m)) {
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
}