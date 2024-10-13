// problem link: https://atcoder.jp/contests/abc347/tasks/abc347_b
// solution link: https://atcoder.jp/contests/abc347/submissions/58747584

import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String S = r.readLine();
        HashSet<String> s = new HashSet<>();
        int ret = 0;
        for(int i = 0; i < S.length(); i++)
            for(int j = i + 1; j <= S.length(); j++)
                if(!s.contains(S.substring(i, j))) {
                    s.add(S.substring(i, j));
                    ret++;
                }
        System.out.println(ret);
    }
}