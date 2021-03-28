import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_17845_수강과목 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] dp = new int[K + 1][N + 1];

		for(int i=1;i<=K;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int I = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());

			for(int j=1;j<=N;j++) {
				if(j < T) dp[i][j] = dp[i-1][j];
				else dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - T] + I);
			}
		}

		System.out.print(dp[K][N]);
	}
}