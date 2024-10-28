// problem link: https://leetcode.com/problems/check-if-it-is-a-straight-line/description/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates[0][0] == coordinates[1][0]) {
            for(int i = 2; i < coordinates.length; i++)
                if(coordinates[i][0] != coordinates[0][0])
                    return false;
            return true;
        }
        double m = (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        for(int i = 2; i < coordinates.length; i++) {
            if(m !=  (double)(coordinates[i][1] - coordinates[i - 1][1]) / (coordinates[i][0] - coordinates[i - 1][0]))
                return false;
        }
        return true;
    }
}