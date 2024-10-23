// problem link: https://leetcode.com/problems/first-bad-version/description/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long l = 1, r = n;
        while(l < r) {
            int m = (int)((l + r) / 2);
            if(isBadVersion(m))
                r = m;
            else
                l = m + 1;
        }
        return (int)l;
    }
}