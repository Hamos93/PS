import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10211_MaximumSubarray {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			int[] X = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				X[i] = Integer.parseInt(st.nextToken());
			
			int[] dp = new int[N];
			int max = -1001;
			for(int i=0;i<N;i++) {
				if(i == 0) dp[i] = X[i];
				else dp[i] = Math.max(dp[i-1] + X[i], X[i]);
				
				max = Math.max(max, dp[i]);
			}
		
			sb.append(max + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}