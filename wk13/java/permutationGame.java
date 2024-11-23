// problem link: https://codeforces.com/problemset/problem/1968/D
// solution link: https://codeforces.com/contest/1968/submission/292988426

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while(t-- > 0) {
            int[] nkBS = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), p = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean[] v = new boolean[nkBS[0]];
            long s = 0, B = 0, k = 0;
            nkBS[2]--;
            while(!v[nkBS[2]] && k < nkBS[1]) {
                v[nkBS[2]] = true;
                B = Math.max(B, s + (nkBS[1] - k++) * a[nkBS[2]]);
                s += a[nkBS[2]];
                nkBS[2] = p[nkBS[2]] - 1;
            }
            long S = 0;
            v = new boolean[nkBS[0]];
            s = 0;
            k = 0;
            nkBS[3]--;
            while(!v[nkBS[3]] && k < nkBS[1]) {
                v[nkBS[3]] = true;
                S = Math.max(S, s + (nkBS[1] - k++) * a[nkBS[3]]);
                s += a[nkBS[3]];
                nkBS[3] = p[nkBS[3]] - 1;
            }
            System.out.println(B == S ? "Draw" : (B > S ? "Bodya" : "Sasha"));
        }
    }
}