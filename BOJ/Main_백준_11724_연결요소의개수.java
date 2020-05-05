import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11724_연결요소의개수 {
	private static int N;
	private static int[][] graph;
	private static boolean[] visit;
	
	private static void dfs(int node) {
		visit[node] = true;
		
		for(int next=1;next<N+1;next++) 
			if(!visit[next] && graph[node][next] == 1) dfs(next);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		graph = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph[u][v] = graph[v][u] = 1;
		}
		
		int answer = 0;
		for(int i=1;i<N+1;i++) {
			if(!visit[i]) {
				answer++;
				
				dfs(i);
			}
		}
		
		System.out.print(answer);
	}
}
