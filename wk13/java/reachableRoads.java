// problem link: https://open.kattis.com/problems/reachableroads

import java.io.*;
import java.math.*;
import java.util.*;

public class reachableroads {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        while(n-- > 0) {
            int m = Integer.parseInt(r.readLine()), rs = Integer.parseInt(r.readLine());
            boolean [][] a = new boolean[m][m];
            while(rs-- > 0) {
                int[] y = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                a[y[0]][y[1]] = true;
                a[y[1]][y[0]] = true;
            }
            LinkedList<Integer> ll = new LinkedList<>();
            int ret = 0;
            boolean[] v = new boolean[m];
            for(int i = 0; i < m; i++) {
                if(v[i])
                    continue;
                ret++;
                ll.add(i);
                while(!ll.isEmpty()) {
                    int t = ll.poll();
                    v[t] = true;
                    for(int j = 0; j < m; j++) {
                        if(!v[j] && a[t][j])
                            ll.add(j);
                    }
                }
            }
            System.out.println(ret - 1);
        }
    }
}