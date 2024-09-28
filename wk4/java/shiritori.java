// problem link: https://open.kattis.com/problems/shiritori

import java.io.*;
import java.math.*;
import java.util.*;

public class shiritori {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        HashSet<String> set = new HashSet<>();
        String p = r.readLine();
        set.add(p);
        for(int i = 1; i < N; i++) {
            String c = r.readLine();
            if(set.contains(c) || p.charAt(p.length() - 1) != c.charAt(0)) {
                System.out.println("Player " + (i % 2 + 1) + " lost");
                return;
            }
            set.add(c);
            p = c;
        }
        System.out.println("Fair Game");
    }
}