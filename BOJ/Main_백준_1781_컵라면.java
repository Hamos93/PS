import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_1781_컵라면 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		List<int[]> list = new ArrayList<>();
		for (int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return Integer.compare(o1[1], o2[1]);

				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i=0;i<N;i++) {
			int deadline = list.get(i)[0];
			int cnt = list.get(i)[1];
	
			pq.offer(cnt);

			if (deadline < pq.size()) pq.poll();
		}
		
		int cupnoodle = 0;
		while (!pq.isEmpty()) cupnoodle += pq.poll();
		
		System.out.print(cupnoodle);
	}
}