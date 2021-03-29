import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4781_사탕가게 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int m = (int)(Double.parseDouble(st.nextToken()) * 100 + 0.5);
			
			if(n == 0 && m == 0) break;
			
			int[][] dp = new int[n + 1][m + 1];
			for(int i=1;i<=n;i++) {
				st = new StringTokenizer(br.readLine(), " ");
		
				int c = Integer.parseInt(st.nextToken());
				int p = (int)(Double.parseDouble(st.nextToken()) * 100 + 0.5);
			
				for(int j=1;j<=m;j++) {
					if(j < p) dp[i][j] = dp[i-1][j];
					else dp[i][j] = Math.max(dp[i-1][j], dp[i][j - p] + c);
				}
			}
			
			sb.append(dp[n][m] + "\n");
		}

		System.out.print(sb.toString().trim());
	}
}