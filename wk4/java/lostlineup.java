// problem link: https://open.kattis.com/problems/lostlineup

import java.io.*;
import java.math.*;
import java.util.*;

public class lostlineup {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        if(n == 1) {
            System.out.println(1);
            return;
        }
        int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        PriorityQueue<Integer> pq = new PriorityQueue<>((b, c) -> a[b] - a[c]);
        for(int i = 0; i < n - 1; i++)
            pq.add(i);
        System.out.print("1 ");
        while(!pq.isEmpty())
            System.out.print((pq.poll() + 2) + " ");
    }
}