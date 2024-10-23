// problem link: https://codeforces.com/contest/706/problem/B
// solution link: https://codeforces.com/contest/706/submission/287073765

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        int[] x = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(x);
        int q = Integer.parseInt(r.readLine());
        while(q-- > 0) {
            System.out.println(search(x, Integer.parseInt(r.readLine())));
        }
    }
    private static int search(int[] x, int m) {
        int l = 0, h = x.length;
        while(l < h) {
            int c = (l + h) / 2;
            if(m < x[c])
                h = c;
            else
                l = c + 1;
        }
        return l;
    }
}