// problem link: https://codeforces.com/problemset/problem/546/A
// solution link: https://codeforces.com/contest/546/submission/278525330

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        long[] knw = Arrays.stream(r.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long nn = knw[2] * (knw[2] + 1) / 2 * knw[0];
        if(nn <= knw[1])
            System.out.println(0);
        else
            System.out.println(nn - knw[1]);
    }
}