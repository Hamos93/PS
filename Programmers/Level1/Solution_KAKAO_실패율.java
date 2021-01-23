import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_KAKAO_실패율 {
	public static int[] solution(int N, int[] stages) {
		PriorityQueue<double[]> pq = new PriorityQueue<double[]>(new Comparator<double[]>() {

			@Override
			public int compare(double[] o1, double[] o2) {
				if(o1[1] < o2[1]) return 1;
				if(o1[1] == o2[1]) {
					if(o2[0] < o1[0]) return 1;
				}
				return -1;
			}
		});

		int player = stages.length;
		for(int i=1;i<=N;i++) {
			double cnt = 0.0;
			for(int j=0;j<stages.length;j++) {
				if(i == stages[j]) 
					cnt++;
			}

			if(player == 0) pq.offer(new double[] { i, 0.0 });
			else {
				pq.offer(new double[] { i, cnt / player });
				player -= cnt;
			}
		}

		int[] answer = new int[pq.size()];
		int idx = 0;

		while(!pq.isEmpty()) 
			answer[idx++] = (int) pq.poll()[0];

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })));
		System.out.println(Arrays.toString(solution(4, new int[] { 4, 4, 4, 4, 4 })));
		System.out.println(Arrays.toString(solution(5, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 })));
	}
}