import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3282_01Knapsack {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] V = new int[N + 1];
			int[] C = new int[N + 1];
			
			for(int i=1;i<=N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				V[i] = Integer.parseInt(st.nextToken());
				C[i] = Integer.parseInt(st.nextToken());
			}
			
			int[][] dp = new int[N + 1][K + 1];
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=K;j++) {
					if(j < V[i]) dp[i][j] = dp[i-1][j];
					else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - V[i]] + C[i]);
				}
			}
			
			sb.append("#" + tc + " " + dp[N][K] + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}