import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_백준_1966_프린터큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");

			// N: 문서의 수, M: 문서의 위치
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			LinkedList<int[]> queue = new LinkedList<>();
			int idx = 0;

			st = new StringTokenizer(br.readLine(), " ");

			// 큐에 문서(중요도, 위치)를 저장
			while(N-- > 0) queue.offer(new int[]{Integer.parseInt(st.nextToken()), idx++});

			// 출력 순서
			int order = 1;
			while(!queue.isEmpty()){
				// 큐에서 가장 높은 중요도 문서 찾기
				int document = 0;
				int docIdx = 0;
				for(int i=0;i<queue.size();i++){
					if(document < queue.get(i)[0]){
						document = queue.get(i)[0];
						docIdx = i;
					}
				}

				// 문서 재배치
				while(docIdx-- > 0) queue.offer(queue.poll());

				int[] curr = queue.poll();
				if(curr[1] == M) {
					System.out.println(order);
					break;
				}

				order++;
			}
		}
	}
}