import java.util.Scanner;

public class Main_백준_9625_BABBA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int[][] dp = new int[2][46];
		dp[0][1] = 0; dp[0][2] = 1;
		dp[1][1] = 1; dp[1][2] = 1;
		
		for(int i=3;i<=45;i++) {
			dp[0][i] = dp[0][i-1] + dp[0][i-2];
			dp[1][i] = dp[1][i-1] + dp[1][i-2];
		}
	
		System.out.print(dp[0][K] + " " + dp[1][K]);
	}
}