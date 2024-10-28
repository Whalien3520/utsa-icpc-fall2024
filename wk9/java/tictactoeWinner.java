// problem link: https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/

class Solution {
    public String tictactoe(int[][] moves) {
        char[][] t = new char[3][3];
        boolean A = true;
        for(int[]  move : moves) {
            t[move[0]][move[1]] = A ? 'X' : 'O';
            if((t[move[0]][0] == t[move[0]][1] && t[move[0]][1] == t[move[0]][2])
            || (t[0][move[1]] == t[1][move[1]] && t[1][move[1]] == t[2][move[1]])
            || (move[0] == move[1] && t[0][0] == t[1][1] && t[1][1] == t[2][2])
            || (move[0] + move[1] == 2 && t[0][2] == t[1][1] && t[1][1] == t[2][0]))
                return A ? "A" : "B";
            A = !A;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}