import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_D3_8500_극장좌석 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				pq.offer(Integer.parseInt(st.nextToken()));
			
			int cnt = 0;
			while(true) {
				int seat = pq.poll();
				
				if(pq.isEmpty()) {
					cnt += (seat * 2);
					break;
				}else cnt += seat;
			}
			
			cnt += N;
			
			sb.append("#" + tc + " " + cnt + "\n");
		}

		System.out.print(sb.toString().trim());
	}
}