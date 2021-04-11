import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11265_끝나지않는파티 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] graph = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				graph[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(int k=0;k<N;k++) {
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
		
			if(graph[A-1][B-1] <= C) sb.append("Enjoy other party\n");
			else sb.append("Stay here\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}