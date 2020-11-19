import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_14241_슬라임합치기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) pq.offer(Integer.parseInt(st.nextToken()));
		
		int score = 0;
		while(true) {
			if(pq.size() == 1) break;
			
			int slime1 = pq.poll();
			int slime2 = pq.poll();
		
			pq.offer(slime1 + slime2);
			score += slime1 * slime2;
		}
		
		System.out.print(score);
	}
}