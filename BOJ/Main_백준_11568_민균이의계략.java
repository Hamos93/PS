import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11568_민균이의계략 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int[] card = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			card[i] = Integer.parseInt(st.nextToken());

		int[] dp = new int[N];
		int LIS = 0;

		for(int i=0;i<N;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++) {
				if(card[j] < card[i]) 
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}

			LIS = Math.max(LIS, dp[i]);
		}

		System.out.print(LIS);
	}
}