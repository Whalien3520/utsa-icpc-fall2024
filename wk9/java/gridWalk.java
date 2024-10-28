// problem link: https://atcoder.jp/contests/abc364/tasks/abc364_b

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] HW = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] ij = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ij[0]--;
        ij[1]--;
        char[][] c = new char[HW[0]][HW[1]];
        for(int i = 0; i < HW[0]; i++)
            c[i] = r.readLine().toCharArray();
        String X = r.readLine();
        for(int i = 0; i < X.length(); i++) {
            int ii = ij[0], jj = ij[1];
            if(X.charAt(i) == 'L')
                jj--;
            else if(X.charAt(i) == 'R')
                jj++;
            else if(X.charAt(i) == 'U')
                ii--;
            else if(X.charAt(i) == 'D')
                ii++;
            if(ii > -1 && ii < HW[0] && jj > -1 && jj < HW[1] && c[ii][jj] != '#') {
                ij[0] = ii;
                ij[1] = jj;
            }
        }
        System.out.println((ij[0] + 1) + " " + (ij[1] + 1));
    }
}