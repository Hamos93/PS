import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3376_파도반수열 {
	public static void main(String[] args) throws Exception {
		long[] dp = new long[101];
		dp[1] = 1; dp[2] = 1; dp[3] = 1;
		
		for(int i=4;i<=100;i++)
			dp[i] = dp[i-3] + dp[i-2];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			System.out.println("#" + tc + " " + dp[N]);
		}
	}
}