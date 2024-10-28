// https://leetcode.com/problems/valid-sudoku/description/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            int r = 0, c = 0, b = 0;
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if((r & (1 << (board[i][j] - '1'))) > 0)
                        return false;
                    r |= (1 << (board[i][j] - '1'));
                }
                if(board[j][i] != '.') {
                    if((c & (1 << (board[j][i] - '1'))) > 0)
                        return false;
                    c |= (1 << (board[j][i] - '1'));
                }
                if(board[3 * (i % 3) + j % 3][3 * (i / 3) + j / 3] != '.') {
                    if((b & (1 << (board[3 * (i % 3) + j % 3][3 * (i / 3) + j / 3] - '1'))) > 0)
                        return false;
                    b |= (1 << (board[3 * (i % 3) + j % 3][3 * (i / 3) + j / 3] - '1'));
                }
            }
        }
        return true;
    }
}