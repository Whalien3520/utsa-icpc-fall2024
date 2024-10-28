// problem link: https://atcoder.jp/contests/abc351/tasks/abc351_b

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        String[] a = new String[N];
        for(int i = 0; i < N; i++)
            a[i] = r.readLine();
        for(int i = 0; i < N; i++) {
            String l = r.readLine();
            if(!l.equals(a[i])) {
                for(int j = 0; j < N; j++)
                    if(l.charAt(j) != a[i].charAt(j)) {
                        System.out.println((i + 1) + " " + (j + 1));
                        return;
                    }
            }
        }
    }
}