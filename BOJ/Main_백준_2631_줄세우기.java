import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2631_줄세우기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N];
		int LIS = 0;
		
		for(int i=0;i<N;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++)
				if(arr[j] < arr[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
			
			LIS = Math.max(LIS, dp[i]);
		}
		
		System.out.print(N - LIS);
	}
}