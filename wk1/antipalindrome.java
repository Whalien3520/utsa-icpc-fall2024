// problem link: https://open.kattis.com/problems/antipalindrome

import java.util.*;
import java.io.*;
public class antipalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char[] t = r.readLine().toLowerCase().toCharArray();
        int pp = -1;
        while(!Character.isAlphabetic(t[++pp])) {}
        
        int p = pp;
        while(p < t.length && !Character.isAlphabetic(t[++p])) {}
        if(p >= t.length) {
            System.out.println("Anti-palindrome");
            return;
        }
        if(t[p] == t[pp]) {
            System.out.println("Palindrome");
            return;
        }
        
        for(int i = p + 1; i < t.length; i++) {
            if(!Character.isAlphabetic(t[i]))
                continue;
            if(t[i] == t[p] || t[i] == t[pp]) {
                System.out.println("Palindrome");
                return;
            }
            pp = p;
            p = i;
        }
        System.out.println("Anti-palindrome");
    }
}