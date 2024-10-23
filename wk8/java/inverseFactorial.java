// problem link: https://open.kattis.com/problems/inversefactorial

import java.io.*;
import java.math.*;
import java.util.*;

public class inversefactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String n = r.readLine();
		if(n.length() < 4) {
		    int nn = Integer.parseInt(n), i = 1, c = 1;
		    while(c != nn)
		        c *= ++i;
		    System.out.println(i);
		    return;
		}
		int i = 1;
		double d = 1.0;
		while(Math.floor(d) < n.length())
			d += Math.log10(i++);
		System.out.println(i - 1);
    }
}