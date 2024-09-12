// problem link: https://open.kattis.com/problems/tripletexting

import java.util.*;
import java.io.*;
public class tripletexting {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String t = r.readLine(), a = t.substring(0, t.length() / 3), b = t.substring(t.length() / 3, 2 * (t.length() / 3)), c = t.substring(2 * (t.length() / 3), t.length());
        if(a.equals(b) || a.equals(c))
            System.out.println(a);
        else
            System.out.println(b);
    }
}
