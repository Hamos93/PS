import java.util.Arrays;
import java.util.Scanner;

public class Main_백준_1699_제곱수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);

		for(int i=1;i<=N;i++) {
			if((int)(Math.sqrt(i)) == (Math.sqrt(i))) {
				dp[i] = 1;
				continue;
			}

			for(int j=1;j<i;j++)
				dp[i] = Math.min(dp[i], dp[i-j] + dp[j]);
		}

		System.out.print(dp[N]);
	}
}