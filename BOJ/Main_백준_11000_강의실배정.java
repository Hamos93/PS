import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_11000_강의실배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int S = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			
			list.add(new int[] { S, T });
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] < o2[0]) return -1;
				if(o1[0] == o2[0]) {
					if(o1[1] < o2[1]) return -1;
				}
				
				return 1;
			}
		});
		
		int cnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0;i<N;i++) {
			int[] get = list.get(i);
			int S = get[0];
			int T = get[1];
			
			if(pq.isEmpty()) {
				cnt++;
				pq.offer(T);
				
				continue;
			}
			
			if(S < pq.peek()) {
				cnt++;
				pq.offer(T);
			}else {
				pq.poll();
				pq.offer(T);
			}
		}
		
		System.out.print(cnt);
	}
}