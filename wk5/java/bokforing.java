// problem link: https://open.kattis.com/problems/bokforing

import java.io.*;
import java.math.*;
import java.util.*;

public class bokforing {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] NQ = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int set = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(NQ[1]-- > 0) {
            String[] l = r.readLine().split(" ");
            if(l[0].charAt(0) == 'S')
                map.put(Integer.parseInt(l[1]), Integer.parseInt(l[2]));
            else if(l[0].charAt(0) == 'R') {
                map = new HashMap<>();
                set = Integer.parseInt(l[1]);
            }
            else {
                int i = Integer.parseInt(l[1]);
                if(map.containsKey(i))
                    System.out.println(map.get(i));
                else
                    System.out.println(set);
            }
        }
    }
}