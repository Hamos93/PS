import java.util.Scanner;

public class Main_백준_9507_GenerationsofTribbles {
	public static void main(String[] args) {
		long[] dp = new long[68];
		dp[0] = 1; dp[1] = 1;
		dp[2] = 2; dp[3] = 4;
		
		for(int i=4;i<=67;i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3] + dp[i-4];
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(0 < t--) {
			int n = sc.nextInt();
			System.out.println(dp[n]);
		}
	}
}