// problem link: https://open.kattis.com/problems/forcedchoice

import java.io.*;
import java.math.*;
import java.util.*;

public class forcedchoice {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] NPS = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(NPS[2]-- > 0) {
            int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean flag = true;
            for(int i = 1; i < a.length && flag; i++)
                if(a[i] == NPS[1]) {
                    System.out.println("KEEP");
                    flag = false;
                }
            if(flag)
                System.out.println("REMOVE");
        }
    }
}