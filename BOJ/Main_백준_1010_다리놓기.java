import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1010_다리놓기 {
	public static void main(String[] args) throws Exception {
		int[][] dp = new int[31][31];
		
		for(int j=1;j<=30;j++) dp[1][j] = j;
		for(int i=2;i<=30;i++) {
			for(int j=i;j<=30;j++) {
				for(int k=j-1;i-1<=k;k--)
					dp[i][j] += dp[i-1][k];
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			System.out.println(dp[N][M]);
		}
	}
}