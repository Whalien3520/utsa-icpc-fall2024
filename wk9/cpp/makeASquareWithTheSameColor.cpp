// problem link: https://leetcode.com/problems/make-a-square-with-the-same-color/description/

class Solution {
public:
    bool canMakeSquare(vector<vector<char>>& grid) {
        int m[4][2] = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};
        for(int i = 0; i < 4; i++) {
            int w = 0;
            for(int j = 0; j < 4; j++)
                if(grid[m[i][0] + m[j][0]][m[i][1] + m[j][1]] == 'W')
                    w++;
            if(w != 2)
                return true;
        }
        return false;
    }
};