import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2644_촌수계산 {
	private static int[][] graph;
	
	private static int bfs(int src, int dest, int n) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[] visit = new boolean[n + 1];
		int result = -1;
		
		queue.offer(new int[] {src, 0});
		visit[src] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int curr = poll[0];
			int cnt = poll[1];
			
			if(curr == dest) {
				result = cnt;
				break;
			}
			
			for(int next=1;next<n+1;next++) {
				if(!visit[next] && graph[curr][next] == 1) {
					queue.offer(new int[] {next, cnt + 1});
					visit[next] = true;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		graph = new int[n + 1][n + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		int src = Integer.parseInt(st.nextToken());
		int dest = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			graph[x][y] = graph[y][x] = 1;
		}
		
		int answer = bfs(src, dest, n);
		System.out.print(answer);
	}
}