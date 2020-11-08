import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_6118_숨바꼭질 {
	private static int N;
	private static List<Integer>[] graph;
	private static int[] dist;
	
	public static void bfs(int barn) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] { barn, 0 });
		dist[barn] = 0;
	
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int curBarn = poll[0], cnt = poll[1];
			
			for(int next : graph[curBarn]) {
				if(dist[next] == -1) {
					queue.offer(new int[] { next, cnt + 1 });
					dist[next] = cnt + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		graph = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			graph[i] = new ArrayList<>();
		
		
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			graph[u].add(v); graph[v].add(u);
		}

		dist = new int[N + 1];
		Arrays.fill(dist, -1);
	
		bfs(1);

		int barn = 0, barnIdx = 0;
		for(int i=1;i<=N;i++) {
			if(barn < dist[i]) {
				barn = dist[i];
				barnIdx = i;
			}
		}
	
		int barnCnt = 0;
		for(int i=1;i<=N;i++)
			if(barn == dist[i]) barnCnt++;
		
		System.out.print(barnIdx + " " + barn + " " + barnCnt);
	}
}