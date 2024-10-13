// problem link: https://open.kattis.com/problems/nucleotides

import java.io.*;
import java.math.*;
import java.util.*;


public class Main {
    static char[] n = new char[] {'A', 'T', 'G', 'C'};
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char[] carr = r.readLine().toCharArray();
        //ACTG order, 1 extra length for empty at front
        int[][] itab = new int[carr.length + 1][4];
        for(int i = 0; i < carr.length; i++) {
            itab[i + 1][(carr[i] >> 1) % 4]++;
            for(int j = 0; j < 4; j++)
                itab[i + 1][j] += itab[i][j];
        }
        int m = Integer.parseInt(r.readLine());
        while(m-- > 0) {
            int[] inds = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] temp = new int[4];
            for(int i = 0; i < 4; i++)
                temp[i] = itab[inds[1]][i] - itab[inds[0] - 1][i];
            
            //sort into ATGC order
            int s = temp[1];
            temp[1] = temp[2];
            temp[2] = temp[3];
            temp[3] = s;
            
            int mask = 0;
            while(mask != 0b1111) {
                int i = 0;
                while(((mask >> i) & 1) == 1)
                    i++;
                for(int j = i + 1; j < 4; j++)
                    if(((mask >> j) & 1) != 1 && temp[j] > temp[i])
                        i = j;
                System.out.print(n[i]);
                mask |= 1 << i;
            }
            System.out.println();
        }
    }
}