import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_14235_크리스마스선물 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) return 1;
				return -1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		while(0 < n--) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			
			if(a == 0) {
				if(pq.isEmpty()) sb.append("-1\n");
				else sb.append(pq.poll() + "\n");
			
				continue;
			}
			
			while(st.hasMoreTokens()) pq.offer(Integer.parseInt(st.nextToken()));
		}
		
		System.out.print(sb.toString().trim());
	}
}