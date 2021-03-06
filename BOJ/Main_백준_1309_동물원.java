import java.util.Scanner;

public class Main_백준_1309_동물원 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] dp = new long[100001];
		dp[1] = 3; dp[2] = 7;
		
		for(int i=3;i<=N;i++)
			dp[i] = (dp[i-1] * 2 + dp[i-2]) % 9901;
		
		System.out.print(dp[N]);
	}
}