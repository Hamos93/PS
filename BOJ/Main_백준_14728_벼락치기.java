import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14728_벼락치기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
	
		int[][] dp = new int[N + 1][T + 1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int K = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			
			for(int j=1;j<=T;j++) {
				if(j < K) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - K] + S);
			}
		}

		System.out.print(dp[N][T]);
	}
}