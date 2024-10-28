// problem link: https://codeforces.com/contest/2000/problem/E
// solution link: https://codeforces.com/contest/2000/submission/288175896

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while(t-- > 0) {
            long[] nmk = Arrays.stream(r.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            int w = Integer.parseInt(r.readLine());
            long[] a = Arrays.stream(r.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            Arrays.sort(a);
            PriorityQueue<Long> pq = new PriorityQueue<>((x, y) -> -Long.compare(x, y));
            for(int i = 0; i < nmk[0]; i++)
                for(int j = 0; j < nmk[1]; j++)
                    pq.add((Math.min(i, nmk[0] - nmk[2]) - Math.max(-1, i - nmk[2])) * (Math.min(j, nmk[1] - nmk[2]) - Math.max(-1, j - nmk[2])));
            long ret = 0;
            for(int i = a.length - 1; i > -1; i--)
                ret += a[i] * pq.poll();
            System.out.println(ret);
        }
    }
}