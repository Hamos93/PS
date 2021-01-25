import java.util.Scanner;

public class Main_백준_2670_연속부분최대곱 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		double[] arr = new double[N + 1];
		for(int i=1;i<=N;i++)
			arr[i] = sc.nextDouble();
		
		double[] dp = new double[N + 1];
		dp[0] = 1;
		
		double result = 0.0;
		for(int i=1;i<=N;i++) {
			dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
			result = Math.max(result, dp[i]); 
		}
		
		System.out.print(String.format("%.3f", result));
	}
}