// problem link: https://codeforces.com/problemset/problem/2000/D
// solution link: https://codeforces.com/contest/2000/submission/285498823

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(r.readLine());
            int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String s = r.readLine();
            
            long[] pre = new long[n + 1];
            for(int i = 0; i < n; i++)
                pre[i + 1] = a[i] + pre[i];

            int l = 0, h = n - 1;
            long ret = 0;
            while(l < h) {
                if(s.charAt(l) != 'L')
                    l++;
                else if(s.charAt(h) != 'R')
                    h--;
                else {
                    ret += pre[h + 1] - pre[l];
                    l++;
                    h--;
                }
            }
            System.out.println(ret);
        }
    }
}