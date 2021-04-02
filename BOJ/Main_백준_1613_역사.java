import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1613_역사 {
	private static final int INF = 100000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
	
		int[][] graph = new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i == j) graph[i][j] = 0;
				else graph[i][j] = INF;
			}
		}
		
		while(0 < k--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			graph[u][v] = 1;
		}
		
		for(int x=1;x<=n;x++) {
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][x] + graph[x][j]);
		}

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");
		int s = Integer.parseInt(st.nextToken());
		
		while(0 < s--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(graph[u][v] == INF && graph[v][u] == INF) sb.append("0\n");
			else if(graph[u][v] != INF) sb.append("-1\n");
			else sb.append("1\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}