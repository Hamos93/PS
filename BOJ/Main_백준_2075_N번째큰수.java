import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_2075_N번째큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) return 1;
				return -1;
			}
		});
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) pq.offer(Integer.parseInt(st.nextToken()));
		}
		
		for(int i=1;i<=N-1;i++)
			pq.poll();
		
		System.out.print(pq.poll());
	}
}