import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2293_동전1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] coin = new int[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			coin[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[k+1];
		dp[0] = 1;
		
		for(int i=0;i<n;i++) {
			for(int j=coin[i];j<=k;j++)
				dp[j] += dp[j - coin[i]];
		}
		
		System.out.print(dp[k]);
	}
}