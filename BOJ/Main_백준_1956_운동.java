import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1956_운동 {
	private static final int INF = 1000000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
	
		int[][] graph = new int[V+1][V+1];
		for(int i=1;i<=V;i++) {
			for(int j=1;j<=V;j++)
				graph[i][j] = INF;
		}
		
		while(0 < E--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
		
			graph[a][b] = c;
		}
		
		for(int k=1;k<=V;k++) {
			for(int i=1;i<=V;i++) 
				for(int j=1;j<=V;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}
	
		int len = INF;
		for(int i=1;i<=V;i++) {
			if(graph[i][i] == INF) continue;
		
			len = Math.min(len, graph[i][i]);
		}
		
		if(len == INF) System.out.print("-1");
		else System.out.print(len);
	
	}
}