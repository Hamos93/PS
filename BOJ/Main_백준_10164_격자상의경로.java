import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10164_격자상의경로 {
	private static int solve(int srcX, int srcY, int destX, int destY, int N, int M) {
		int[][] dp = new int[N][M];
		dp[srcX][srcY] = 1;

		for(int i=srcX;i<=destX;i++) {
			for(int j=srcY;j<=destY;j++) {
				if(0 <= i-1) dp[i][j] += dp[i-1][j];
				if(0 <= j-1) dp[i][j] += dp[i][j-1];
			}
		}

		return dp[destX][destY];
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		if(K == 0) System.out.println(solve(0, 0, N-1, M-1, N, M));
		else {
			int x = (K - 1) / M;
			int y = (K - 1) % M;

			int result1 = solve(0, 0, x, y, N, M);
			int result2 = solve(x, y, N-1, M-1, N, M);

			System.out.print(result1 * result2);
		}
	}
}