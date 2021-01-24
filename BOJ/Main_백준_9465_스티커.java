import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9465_스티커 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
		
			long[][] sticker = new long[n+1][2];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=1;i<=n;i++)
				sticker[i][0] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=1;i<=n;i++)
				sticker[i][1] = Integer.parseInt(st.nextToken());
			
			long[][] dp = new long[n+1][3];
			for(int i=1;i<=n;i++) {
				dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
				dp[i][1] = sticker[i][0] + Math.max(dp[i-1][0], dp[i-1][2]);
				dp[i][2] = sticker[i][1] + Math.max(dp[i-1][0], dp[i-1][1]);
			}
			
			System.out.println(Math.max(dp[n][0], Math.max(dp[n][1], dp[n][2])));
		}
	}
}