import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_15624_피보나치수7 {
	public static void main(String[] args) throws Exception {
		long[] dp = new long[1000001];
		dp[0] = 0; dp[1] = 1;
		
		for(int i=2;i<=1000000;i++) {
			dp[i] = dp[i-1] + dp[i-2];
			dp[i] %= 1000000007;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		System.out.print(dp[n]);
	}
}