import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11562_백양로브레이크 {
	private static final int INF = 100000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] graph = new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				if(i != j) graph[i][j] = INF;
		}
		
		while(0 < m--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			if(b == 0) {
				graph[u][v] = 0;
				graph[v][u] = 1;
			}else graph[u][v] = graph[v][u] = 0;
		}
		
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]); 
		}
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		int k = Integer.parseInt(st.nextToken());
		
		while(0 < k--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
		
			sb.append(graph[s][e] + "\n");
		}

		System.out.print(sb.toString().trim());
	}
}