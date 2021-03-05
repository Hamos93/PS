import java.util.Scanner;

public class Main_백준_2225_합분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		long[][] dp = new long[N + 1][K + 1];
		for(int i=1;i<=N;i++)
			dp[i][1] = 1;
		
		for(int j=1;j<=K;j++)
			dp[1][j] = j;
		
		for(int i=2;i<=N;i++) {
			for(int j=2;j<=K;j++)
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
		}
		
		System.out.print(dp[N][K]);
	}
}