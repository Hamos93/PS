import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2458_키순서 {
	private static final int INF = 100000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(i == j) continue;
				else graph[i][j] = INF;
			}
		}
		
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			graph[u][v] = 1;
		}
		
		for(int k=1;k<=N;k++) {
			for(int i=1;i<=N;i++)
				for(int j=1;j<=N;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}
		
		int cnt = 0;
		for(int i=1;i<=N;i++) {
			boolean flag = true;
			for(int j=1;j<=N;j++) {
				if(i == j) continue;
				
				if(graph[i][j] == INF && graph[j][i] == INF) {
					flag = false;
					break;
				}
			}
			
			if(flag) cnt++;
		}
		
		System.out.print(cnt);
	}
}