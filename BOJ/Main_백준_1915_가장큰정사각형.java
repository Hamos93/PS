import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1915_가장큰정사각형 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] dp = new int[n][m];
		for(int i=0;i<n;i++) {
			String input = br.readLine();
			for(int j=0;j<m;j++)
				dp[i][j] = input.charAt(j) - '0';
		}

		int len = 0; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(dp[i][j] == 1) {
					len = Math.max(len, dp[i][j]);
					if(0 <= i-1 && 0 <= j-1) {
						if(0 < dp[i-1][j] && 0 < dp[i][j-1] && 0 < dp[i-1][j-1]) {
							dp[i][j] = Math.min((Math.min(dp[i-1][j], dp[i][j-1])), dp[i-1][j-1]) + 1;
							len = Math.max(len, dp[i][j]);
						}
					}
				}
			}
		}

		System.out.print(len * len);
	}
}