// problem link: https://open.kattis.com/problems/jackolanternjuxtaposition

import java.util.*;
import java.io.*;
public class jackolanternjuxtaposition {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(arr[0] * arr[1] * arr[2]);
    }
}
