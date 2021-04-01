import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11404_플로이드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int[][] graph = new int[n+1][n+1];

		int INF = (int) 1e9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i == j) graph[i][j] = 0;
				else graph[i][j] = INF;
			}
		}

		st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		
		while(0 < m--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			graph[a][b] = Math.min(graph[a][b], c);
		}

		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(graph[i][j] == INF) graph[i][j] = 0;
				
				if(j == n) sb.append(graph[i][j]);
				else sb.append(graph[i][j] + " ");
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}