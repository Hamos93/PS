import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10159_저울 {
	private static final int INF = 100000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[][] graph = new int[N+1][N+1];
	
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(i == j) graph[i][j] = 0;
				else graph[i][j] = INF;
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			graph[v][u] = 1;
		}
		
		for(int k=1;k<=N;k++) {
			for(int i=1;i<=N;i++)
				for(int j=1;j<=N;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}

		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=N;i++) {
			int cnt = 0;
			for(int j=1;j<=N;j++) {
				if(i == j) continue;
				if(graph[i][j] == INF && graph[j][i] == INF) 
					cnt++;
			}
			
			sb.append(cnt + "\n");
		}
	
		System.out.print(sb.toString().trim());
	}
}