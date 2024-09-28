// problem link: https://open.kattis.com/problems/keywords

import java.io.*;
import java.math.*;
import java.util.*;

public class keywords {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        PriorityQueue<String> pq = new PriorityQueue<>();
        while(n-- > 0)
            pq.add(r.readLine().toLowerCase().replace(' ', '-'));
        String p = pq.poll();
        int ret = 1;
        while(!pq.isEmpty()) {
            String c = pq.poll();
            if(!p.equals(c)) {
                p = c;
                ret++;
            }
        }
        System.out.println(ret);
    }
}