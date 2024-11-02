// problem link: https://codeforces.com/problemset/problem/681/C
// solution link: https://codeforces.com/contest/681/submission/289558599

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        ArrayList<String> ret = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(n-- > 0) {
            String s = r.readLine();
            switch(s.charAt(0)) {
                case 'i':
                    pq.add(Integer.parseInt(s.substring(7)));
                    break;
                case 'g':
                    int i = Integer.parseInt(s.substring(7));
                    while(!pq.isEmpty() && pq.peek() < i) {
                        pq.poll();
                        ret.add("removeMin");
                    }
                    if(pq.isEmpty() || pq.peek() != i) {
                        pq.add(i);
                        ret.add("insert " + i);
                    }
                    break;
                case 'r':
                    if(pq.isEmpty())
                        ret.add("insert 0");
                    else
                        pq.poll();
            }
            ret.add(s);
        }
        System.out.println(ret.size());
        for(String s : ret)
            System.out.println(s);
    }
}