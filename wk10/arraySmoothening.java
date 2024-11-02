// problem link: https://open.kattis.com/problems/arraysmoothening

import java.io.*;
import java.math.*;
import java.util.*;

public class arraysmoothening {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] A = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i : A)
            m.put(i, m.getOrDefault(i, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> m.get(b) - m.get(a));
        m.forEach((k, v) -> pq.add(k));
        int u = 1, d = m.get(pq.poll());
        while(NK[1] > 0 && !pq.isEmpty()) {
            int i = pq.poll();
            if(m.get(i) == d) {
                u++;
                continue;
            }
            int s = Math.min(d - m.get(i), NK[1] / u);
            d -= s;
            NK[1] -= s * u;
            u++;
        }
        if(NK[1] > 0)
            d -= Math.min(d, NK[1] / u);
        System.out.println(d);
    }
}