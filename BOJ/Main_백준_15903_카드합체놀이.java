import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_15903_카드합체놀이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) pq.offer(Long.parseLong(st.nextToken()));
		
		while(0 < M--) {
			long card1 = pq.poll();
			long card2 = pq.poll();
			
			long result = card1 + card2;
			pq.offer(result);
			pq.offer(result);
		}
		
		long sum = 0;
		for(long value : pq)
			sum += value;
		
		System.out.print(sum);
	}
}