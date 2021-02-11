import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main_백준_2346_풍선터뜨리기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		int idx = 1;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) deque.offer(new int[] { idx++, Integer.parseInt(st.nextToken()) });
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int[] poll = deque.poll();
			sb.append(poll[0] + " ");
			
			if(deque.isEmpty()) break;
			
			if(0 < poll[1]) {
				while(1 < poll[1]--) 
					deque.offer(deque.poll());
			}else {
				poll[1] *= -1;
				
				while(0 < poll[1]--)
					deque.offerFirst(deque.pollLast());
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}