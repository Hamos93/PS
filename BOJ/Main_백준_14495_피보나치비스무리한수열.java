import java.util.Scanner;

public class Main_백준_14495_피보나치비스무리한수열 {
	public static void main(String[] args) {
		long[] dp = new long[117];
		dp[1] = dp[2] = dp[3] = 1;
		
		for(int i=4;i<=116;i++)
			dp[i] = dp[i-1] + dp[i-3];
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(dp[n]);
	}
}