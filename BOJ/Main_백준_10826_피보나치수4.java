import java.math.BigInteger;
import java.util.Scanner;

public class Main_백준_10826_피보나치수4 {
	public static void main(String[] args) {
		BigInteger[] dp = new BigInteger[10001];
		dp[0] = BigInteger.ZERO; dp[1] = BigInteger.ONE;
		
		for(int i=2;i<=10000;i++)
			dp[i] = dp[i-1].add(dp[i-2]);
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(dp[n]);
	}
}