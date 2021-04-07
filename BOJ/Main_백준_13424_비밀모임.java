import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13424_비밀모임 {
	private static final int INF = 1000000;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] graph = new int[N + 1][N + 1];
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++)
					if(i != j) graph[i][j] = INF;
			}
			
			while(0 < M--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				graph[a][b] = graph[b][a] = c; 
			}
			
			for(int k=1;k<=N;k++) {
				for(int i=1;i<=N;i++)
					for(int j=1;j<=N;j++)
						graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
			}

			st = new StringTokenizer(br.readLine(), " ");

			int K = Integer.parseInt(st.nextToken());
			int[] point = new int[K];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<K;i++)
				point[i] = Integer.parseInt(st.nextToken());
			
			int idx = 0, distance = Integer.MAX_VALUE;
			for(int i=1;i<=N;i++) {
				int len = 0;
				for(int j=0;j<K;j++)
					len += graph[point[j]][i];
			
				if(len < distance) {
					distance = len;
					idx = i;
				}
			}
			
			sb.append(idx + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}