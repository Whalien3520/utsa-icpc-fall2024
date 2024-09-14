// problem link: https://codeforces.com/problemset/problem/4/A
// solution link: https://codeforces.com/contest/4/submission/277590367

import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(r.readLine());
        System.out.println((w > 2 && w % 2 == 0) ? "YES" : "NO");
    }
}