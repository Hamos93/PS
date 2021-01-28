import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11054_가장긴바이토닉부분수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[2][N];
		for(int i=0;i<2;i++)
			Arrays.fill(dp[i], 1);

		// LIS
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				if(A[j] < A[i])
					dp[0][i] = Math.max(dp[0][i], dp[0][j] + 1); 
			}
		}
		
		// LDS
		for(int i=N-1;0<=i;i--) {
			for(int j=N-1;i<=j;j--) {
				if(A[j] < A[i]) {
					dp[1][i] = Math.max(dp[1][i], dp[1][j] + 1);
				}
			}
		}
		
		int result = 0;
		for(int i=0;i<N;i++) {
			int len = dp[0][i] + dp[1][i] - 1;
			result = Math.max(result, len);
		}
		
		System.out.print(result);
	}
}