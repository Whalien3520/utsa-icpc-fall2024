// problem link: https://codeforces.com/problemset/problem/6/C
// solution link: https://codeforces.com/contest/6/submission/285500257

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int l = 0, h = n - 1, c = 0;
        while(l <= h) {
            if(c <= 0)
                c += a[l++];
            else
                c -= a[h--];
        }
        System.out.println(l + " " + (a.length - l));
    }
}