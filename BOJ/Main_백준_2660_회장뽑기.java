import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2660_회장뽑기 {
	private static final int INF = 1000;
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

		while(true) {
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(u == -1 && v == -1) break;
			
			graph[u][v] = graph[v][u] = 1;
		}

		for(int k=1;k<=N;k++) {
			for(int i=1;i<=N;i++)
				for(int j=1;j<=N;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}
		
		int[] score = new int[N+1];
		int max = 0;
		
		for(int i=1;i<=N;i++) {
			int value = 0;
			for(int j=1;j<=N;j++) {
				if(i == j || graph[i][j] == 0) continue;
				if(value < graph[i][j]) value = graph[i][j];
			}

			score[i] = value;
		}

		int min = Integer.MAX_VALUE;
		for(int i=1;i<=N;i++) {
			if(score[i] != 0 && score[i] < min) 
				min = score[i];
		}
		
		StringBuilder sb = new StringBuilder();
		int cnt = 0;

		for(int i=1;i<=N;i++) {
			if(min == score[i]) {
				cnt++;
				sb.append(i + " ");
			}
		}
		
		System.out.println(min + " " + cnt);
		System.out.print(sb.toString().trim());
	}
}