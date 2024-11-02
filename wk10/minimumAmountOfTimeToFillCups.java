// problem link: https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/

class Solution {
    public int fillCups(int[] amount) {
        int m = amount[0] > amount[1] ? 0 : 1;
        m = amount[m] > amount[2] ? m : 2;
        if(amount[m] > amount[(m + 1) % 3] + amount[(m + 2) % 3])
            return amount[m];
        int s = amount[0] + amount[1] + amount[2];
        return s / 2 + (s % 2 == 0 ? 0 : 1);
    }
}