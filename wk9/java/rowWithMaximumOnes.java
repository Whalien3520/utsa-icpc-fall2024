// problem link: https://leetcode.com/problems/row-with-maximum-ones/description/

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = -1, ret = -1;
        for(int i = 0; i < mat.length; i++) {
            int c = 0;
            for(int j = 0; j < mat[i].length; j++)
                c += mat[i][j];
            if(c > max) {
                max = c;
                ret = i;
            }
        }
        return new int[] {ret, max};
    }
}