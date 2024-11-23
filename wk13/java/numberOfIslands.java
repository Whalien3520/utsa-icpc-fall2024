// problem link: https://leetcode.com/problems/number-of-islands/description/

class Solution {
    char[][] g;
    public int numIslands(char[][] grid) {
        g = grid;
        int ret = 0;
        for(int r = 0; r < grid.length; r++)
            for(int c = 0; c < grid[0].length; c++)
                if(grid[r][c] == '1') {
                    ret++;
                    dfs(r, c);
                }
        return ret;
    }
    public void dfs(int r, int c) {
        if(r < 0 || r >= g.length || c < 0 || c >= g[0].length || g[r][c] == '0')
            return;
        g[r][c] = '0';
        dfs(r - 1, c);
        dfs(r + 1, c);
        dfs(r, c - 1);
        dfs(r, c + 1);
    }
}