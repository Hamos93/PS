import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1495_기타리스트 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] V = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			V[i] = Integer.parseInt(st.nextToken());
		
		boolean[][] dp = new boolean[N+1][M+1];
		dp[0][S] = true;
		
		for(int i=1;i<=N;i++) {
			for(int j=0;j<=M;j++) {
				if(!dp[i-1][j]) continue;
				
				if(j - V[i-1] >= 0) dp[i][j-V[i-1]] = true;
				if(j + V[i-1] <= M) dp[i][j+V[i-1]] = true;
			}
		}
		
		int result = -1;
		for(int j=M;0<=j;j--)
			if(dp[N][j]) {
				result = j;
				break;
			}
	
		System.out.print(result);
	}
}