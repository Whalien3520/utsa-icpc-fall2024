// problem link: https://open.kattis.com/problems/escapewallmaria

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] tNM = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] g = new char[tNM[1]][];
        int[][] t = new int[tNM[1]][tNM[2]];
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i = 0; i < tNM[1]; i++) {
            g[i] = r.readLine().toCharArray();
            for(int j = 0; j < tNM[2]; j++)
                if(g[i][j] == 'S') {
                    ll.add(i);
                    ll.add(j);
                }
        }
        while(!ll.isEmpty()) {
            int row = ll.poll(), col = ll.poll();
            if(row == 0 || row + 1 == tNM[1] || col == 0 || col + 1 == tNM[2]) {
                System.out.println(t[row][col]);
                return;
            }
            if(t[row][col] == tNM[0]) {
                System.out.println("NOT POSSIBLE");
                return;
            }
            if((g[row - 1][col] == 'D') || (g[row - 1][col] == '0' && t[row - 1][col] == 0)) {
                t[row - 1][col] = t[row][col] + 1;
                ll.add(row - 1);
                ll.add(col);
            }
            if((g[row + 1][col] == 'U') || (g[row + 1][col] == '0' && t[row + 1][col] == 0)) {
                t[row + 1][col] = t[row][col] + 1;
                ll.add(row + 1);
                ll.add(col);
            }
            if((g[row][col - 1] == 'R') || (g[row][col - 1] == '0' && t[row][col - 1] == 0)) {
                t[row][col - 1] = t[row][col] + 1;
                ll.add(row);
                ll.add(col - 1);
            }
            if((g[row][col + 1] == 'L') || (g[row][col + 1] == 0 && t[row][col + 1] == 0)) {
                t[row][col + 1] = t[row][col] + 1;
                ll.add(row);
                ll.add(col + 1);
            }
        }
        System.out.println("NOT POSSIBLE");
    }
}