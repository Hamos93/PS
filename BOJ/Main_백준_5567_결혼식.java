import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_5567_결혼식 {
	private static int n;
	private static List<Integer>[] graph;
	private static int[] result;

	public static void bfs(int node) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visit = new boolean[n + 1];
		
		queue.offer(new int[] { node, 0 });
		visit[node] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int cur = poll[0];
			int cnt = poll[1];
			
			for(int next : graph[cur]) {
				if(!visit[next]) {
					queue.offer(new int[] { next, cnt + 1 });
					visit[next] = true;
					
					result[next] = cnt + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		graph = new ArrayList[n + 1];
		
		for(int i=1;i<=n;i++)
			graph[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		
		while(0 < m--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		
		result = new int[n + 1];
		bfs(1);
		
		int answer = 0;
		for(int i=1;i<=n;i++)
			if(result[i] == 1 || result[i] == 2) answer++;

		System.out.print(answer);
	}
}