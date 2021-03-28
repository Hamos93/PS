import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5215_햄버거다이어트 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int TC = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=TC;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
		
			int[][] dp = new int[N + 1][L + 1];
			
			for(int i=1;i<=N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int T = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				
				for(int j=1;j<=L;j++) {
					if(j < K) dp[i][j] = dp[i-1][j];
					else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - K] + T);
				}
			}
		
			sb.append("#" + tc + " " + dp[N][L] + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}