import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2502_떡먹는호랑이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int D = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[2][31];
		dp[0][3] = 1; dp[0][4] = 2;
		dp[1][3] = 1; dp[1][4] = 1;
		
		for(int i=5;i<=30;i++) {
			dp[0][i] = dp[0][i-1] + dp[0][i-2];
			dp[1][i] = dp[1][i-1] + dp[1][i-2];
		}
		
		int x = 0, y = 0;
		for(int i=1;;i++) {
			int result = K - i * dp[1][D];
		
			if(result % dp[0][D] == 0) {
				x = i;
				y = result / dp[0][D]; 
				
				break;
			}
		}

		System.out.print(x + "\n" + y);
	}
}