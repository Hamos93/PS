import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1912_연속합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[n];
		dp[0] = arr[0];
		
		for(int i=1;i<n;i++) {
			if(dp[i-1] + arr[i] < arr[i]) dp[i] = arr[i];
			else dp[i] = dp[i-1] + arr[i];
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			max = max < dp[i] ? dp[i] : max;
			
		System.out.print(max);
	}
}