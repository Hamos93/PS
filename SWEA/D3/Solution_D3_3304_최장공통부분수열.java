import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3304_최장공통부분수열 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String A = st.nextToken();
			String B = st.nextToken();
			
			int[][] dp = new int[A.length() + 1][B.length() + 1];
			for(int i=1;i<=A.length();i++) {
				for(int j=1;j<=B.length();j++) {
					if(A.charAt(i-1) == B.charAt(j-1)) dp[i][j] = dp[i-1][j-1] + 1;
					else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
			
			sb.append("#" + tc + " " + dp[A.length()][B.length()] + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}