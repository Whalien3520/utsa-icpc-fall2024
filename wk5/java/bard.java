// problem link: https://open.kattis.com/problems/bard

import java.io.*;
import java.math.*;
import java.util.*;

public class bard {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine()), E = Integer.parseInt(r.readLine());
        boolean[][] t = new boolean[E][N + 1];
        int songs = 0;
        for(int i = 0; i < E; i++) {
            int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(containsOne(a)) {
                for(int j = 1; j < a.length; j++)
                    t[songs][a[j]] = true;
                songs++;
            }
            else {
                for(int j = 0; j < songs; j++)
                    for(int k = 1; k < a.length; k++)
                        if (t[j][a[k]]) {
                            for(int l = 1; l < a.length; l++)
                                t[j][a[l]] = true;
                            break;
                        }
            }
        }
        for(int i = 1; i < N + 1; i++) {
            boolean flag = true;
            for(int j = 0; j < songs && flag; j++)
                if(!t[j][i])
                    flag = false;
            if(flag)
                System.out.println(i);
        }
    }
    private static boolean containsOne(int[] a) {
        for(int i = 0; i < a.length; i++)
            if(a[i] == 1)
                return true;
        return false;
    }
}