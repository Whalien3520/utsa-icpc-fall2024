// problem link: https://open.kattis.com/problems/jollyjumpers

import java.io.*;
import java.math.*;
import java.util.*;

public class jollyjumpers {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = r.readLine()) != null) {
            int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            HashSet<Integer> set = new HashSet<>();
            boolean flag = true;
            for(int i = 2; i < a.length && flag; i++) {
                int c = Math.abs(a[i] - a[i - 1]);
                if(c == 0 || c > a[0] - 1 || set.contains(c)) {
                    System.out.println("Not jolly");
                    flag = false;
                }
                set.add(c);
            }
            if(flag)
                System.out.println("Jolly");
        }
    }
}