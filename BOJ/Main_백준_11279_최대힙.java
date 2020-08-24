import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main_백준_11279_최대힙 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = Integer.parseInt(br.readLine());
		while(0 < N--) {
			int x = Integer.parseInt(br.readLine());
			
			if(x != 0) pq.add(x);
			else {
				if(pq.isEmpty()) sb.append("0\n");
				else sb.append(pq.poll() + "\n");
			}
		}

		System.out.print(sb.toString().trim());
	}
}