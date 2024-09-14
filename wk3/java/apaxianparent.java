// problem link: https://open.kattis.com/problems/apaxianparent

import java.util.*;
import java.io.*;
public class apaxianparent {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] yp = r.readLine().split(" ");
        if("aeiou".indexOf(yp[0].charAt(yp[0].length() - 1)) > -1)
            System.out.println(yp[0].substring(0, yp[0].length() - 1) + "ex" + yp[1]);
        else if(yp[0].charAt(yp[0].length() - 2) == 'e' && yp[0].charAt(yp[0].length() - 1) == 'x')
            System.out.println(yp[0] + yp[1]);
        else
            System.out.println(yp[0] + "ex" + yp[1]);
    }
}
