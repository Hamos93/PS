import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_18352_특정거리의도시찾기 {
	private static List<Integer>[] graph;
	private static int[] visit;

	private static void bfs(int X, int N) {
		Queue<int[]> queue = new LinkedList<>();
		visit = new int[N + 1];

		queue.offer(new int[] { X, 0 });
		visit[X] = 0;

		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int cur = poll[0], cnt = poll[1];

			for(int next : graph[cur]) {
				if(visit[next] == 0) {
					queue.offer(new int[] { next, cnt + 1 });
					visit[next] = cnt + 1;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			graph[i] = new ArrayList<>();

		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
		}

		bfs(X, N);

		StringBuilder sb = new StringBuilder();
		boolean flag = false;

		for(int i=1;i<=N;i++) {
			if(visit[i] == K){
				sb.append(i + "\n");
				flag = true;
			}
		}

		if(!flag) System.out.print("-1");
		else System.out.print(sb.toString());
	}
}