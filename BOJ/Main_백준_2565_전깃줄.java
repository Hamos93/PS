import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2565_전깃줄 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] powerPole = new int[501];

		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			powerPole[A] = B;
		}

		int[] dp = new int[501];
		dp[1] = 1;

		int LIS = 1;
		for(int i=2;i<=500;i++) {
			if(powerPole[i] == 0) continue;
			else dp[i] = 1;
			for(int j=1;j<i;j++) {
				if(powerPole[j] == 0) continue;
				
				if(powerPole[j] < powerPole[i]) 
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			
			LIS = Math.max(LIS, dp[i]);
		}

		if(N > LIS) System.out.print(N - LIS);
		else System.out.print("0");
	}
}