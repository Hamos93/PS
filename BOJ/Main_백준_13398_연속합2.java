import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_13398_연속합2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[2][n];
		int result = -1001;
		
		for(int i=0;i<n;i++) {
			dp[0][i] = arr[i];
			if(0 < i) dp[0][i] = Math.max(dp[0][i-1] + arr[i], arr[i]);
		
			result = Math.max(result, dp[0][i]);
		}
		
		for(int i=n-1;0<=i;i--) {
			dp[1][i] = arr[i];
			if(i < n-1) dp[1][i] = Math.max(dp[1][i+1] + arr[i], arr[i]);

			result = Math.max(result, dp[1][i]);
		}
		
		for(int i=1;i<=n-2;i++)
			result = Math.max(result, dp[0][i-1] + dp[1][i+1]);
		
		System.out.print(result);
	}
}