import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2302_극장좌석 {
	public static void main(String[] args) throws Exception {
		int[] dp = new int[41];
		dp[0] = 1; dp[1] = 1;

		for(int i=2;i<=40;i++)
			dp[i] = dp[i-1] + dp[i-2];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int idx = 0, answer = 1;
		while(0 < M--) {	
			int vip = Integer.parseInt(br.readLine());
			answer *= dp[vip - idx - 1];

			idx = vip;
		}

		answer *= dp[N - idx];

		System.out.print(answer);
	}
}