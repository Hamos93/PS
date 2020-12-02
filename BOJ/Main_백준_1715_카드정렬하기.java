import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_1715_카드정렬하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			pq.offer(Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		while(true) {
			if(2 <= pq.size()) {
				int card1 = pq.poll();
				int card2 = pq.poll();

				pq.offer(card1 + card2);
				
				cnt += card1 + card2;
			}else break;
		}

		System.out.print(cnt);
	}
}