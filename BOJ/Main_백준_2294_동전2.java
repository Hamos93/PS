import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_2294_동전2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			coins[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[k + 1];
		Arrays.fill(dp, 10001);
		
		dp[0] = 0;
		for(int i=0;i<n;i++) {
			for(int j=coins[i];j<=k;j++)
				dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
		}
		
		if(dp[k] == 10001) System.out.print("-1");
		else System.out.print(dp[k]);
	}
}