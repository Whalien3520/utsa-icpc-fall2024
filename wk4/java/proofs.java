// problem link: https://open.kattis.com/problems/proofs

import java.io.*;
import java.math.*;
import java.util.*;

public class proofs {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        HashSet<String> s = new HashSet<>();
        for(int i = 1; i <= n; i++) {
            String[] a = r.readLine().split(" ");
            for(int j = 0; j < a.length - 2; j++)
                if(!s.contains(a[j])) {
                    System.out.println(i);
                    return;
                }
            s.add(a[a.length - 1]);
        }
        System.out.println("correct");
    }
}