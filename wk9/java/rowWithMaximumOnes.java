// problem link: https://leetcode.com/problems/row-with-maximum-ones/description/

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ret = new int[] {-1, -1};
        for(int i = 0; i < mat.length; i++) {
            int c = 0;
            for(int j = 0; j < mat[i].length; j++)
                c += mat[i][j];
            if(c > ret[1]) {
                ret[1] = c;
                ret[0] = i;
            }
        }
        return ret;
    }
}
