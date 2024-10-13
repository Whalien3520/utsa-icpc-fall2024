// problem link: https://codeforces.com/problemset/problem/1927/A
// solution link: https://codeforces.com/contest/1927/submission/285481259

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(r.readLine());
            String s = r.readLine();
            int l = 0, h = n - 1;
            while(s.charAt(l) != 'B')
                l++;
            while(s.charAt(h) != 'B')
                h--;
            System.out.println(h - l + 1);
        }
    }
}