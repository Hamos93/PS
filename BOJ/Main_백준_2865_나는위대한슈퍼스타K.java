import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_2865_나는위대한슈퍼스타K {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
			@Override
			public int compare(double[] o1, double[] o2) {
				if(o1[1] < o2[1]) return 1;

				return -1;
			}
		});

		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");

			while(st.hasMoreTokens()) {
				int no = Integer.parseInt(st.nextToken());
				double ability = Double.parseDouble(st.nextToken());

				pq.offer(new double[] { no, ability });
			}
		}

		boolean[] visit = new boolean[N + 1];

		double sum = 0;
		while(true) {
			if(K == 0) break;

			double[] poll = pq.poll();

			int no = (int) poll[0];		

			if(!visit[no]) {
				visit[no] = true;
				sum += poll[1];

				K--;
			}
		}

		System.out.print(String.format("%.1f", sum));
	}
}