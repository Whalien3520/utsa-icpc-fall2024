// problem link: https://open.kattis.com/problems/guessthedatastructure

import java.io.*;
import java.math.*;
import java.util.*;

public class guessthedatastructure {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = scan.readLine()) != null) {
			//System.out.println(str);
			int n = Integer.parseInt(str);
			Stack<Integer> s = new Stack<>();
			LinkedList<Integer> q = new LinkedList<>();
			PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
			boolean bools = true, boolq = true, boolpq = true;
			while(n-- > 0) {
				int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				if(arr[0] == 1) {
					if(bools)
						s.push(arr[1]);
					if(boolq)
						q.add(arr[1]);
					if(boolpq)
						pq.add(arr[1]);
					continue;
				}
				if(bools && (s.isEmpty() || s.pop() != arr[1]))
					bools = false;
				if(boolq && (q.isEmpty() || q.poll() != arr[1]))
					boolq = false;
				if(boolpq && (pq.isEmpty() || pq.poll() != arr[1]))
					boolpq = false;
				if(!(bools || boolq || boolpq))
					break;
			}
			while(n-- > 0)
				scan.readLine();
			if((bools && boolq) || (bools && boolpq) || (boolq && boolpq))
				System.out.println("not sure");
			else if(bools)
				System.out.println("stack");
			else if(boolq)
				System.out.println("queue");
			else if(boolpq)
				System.out.println("priority queue");
			else
				System.out.println("impossible");
		}
		scan.close();
	}
}