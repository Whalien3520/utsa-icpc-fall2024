// problem link: https://codeforces.com/contest/1997/problem/C
// solution link: https://codeforces.com/contest/1997/submission/273937912

import java.io.*;
import java.math.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(r.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(r.readLine()), ret = 0;;
		    String s = r.readLine();
		    Stack<Integer> st = new Stack<>();
		    for(int i = 0; i < n; i++) {
		        if(i % 2 == 0) {
		            if(st.isEmpty())
		                st.push(i);
		            else
		                ret += i - st.pop();
		        }
		        else {
		            if(s.charAt(i) == '(')
		                st.push(i);
		            else
		                ret += i - st.pop();
		        }
		    }
		    System.out.println(ret);
		}
	}
}