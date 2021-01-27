import java.util.Scanner;

public class Main_백준_17175_피보나치는지겨웡 {
	public static void main(String[] args) {
		long[] dp = new long[51];
		dp[0] = dp[1] = 1;
		
		for(int i=2;i<=50;i++) {
			dp[i] = (dp[i-1] + dp[i-2] + 1) % 1000000007;
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.print(dp[n]);
	}
}