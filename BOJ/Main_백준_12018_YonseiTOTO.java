import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_12018_YonseiTOTO {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		while(0 < n--) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int P = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			
			int[] mileage = new int[P];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<P;i++)
				mileage[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(mileage);
			
			if(P < L) pq.offer(1);
			else pq.offer(mileage[P - L]);
		}
		
		int cnt = 0;
		while(!pq.isEmpty() && 0 <= m - pq.peek()) {
			m -= pq.poll();
			cnt++;
		}
		
		System.out.print(cnt);
	}
}