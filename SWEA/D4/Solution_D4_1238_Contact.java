import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1238_Contact {
	private static int[][] graph;
	private static final int N = 100;
	
	private static int bfs(int start) {
		Queue<int[]> queue = new LinkedList<>();
		int[] visit = new int[N+1];
		
		queue.offer(new int[] { start, 1 });
		visit[start] = 1;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int node = poll[0];
			int level = poll[1];
			
			for(int next=1;next<=N;next++) {
				if(graph[node][next] == 1 && visit[next] == 0) {
					queue.offer(new int[] { next, level + 1 });
					visit[next] = level + 1;
				}
			}
		}
		
		int idx = -1, max = Integer.MIN_VALUE;
		for(int i=1;i<=N;i++) {
			if(max <= visit[i]) {
				idx = i;
				max = visit[i];
			}
		}
		
		return idx;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int len = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());
			
			graph = new int[N+1][N+1];
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
			
				graph[i][j] = 1;
			}
			
			System.out.println("#" + tc + " " + bfs(start));
		}
	}
}