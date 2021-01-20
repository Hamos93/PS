import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1890_점프 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		long[][] dp = new long[N][N];
		dp[0][0] = 1;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j] == 0 || (i == N-1 && j == N-1)) continue;
				int distance = map[i][j];
				
				if(i + distance < N) dp[i + distance][j] += dp[i][j];
				if(j + distance < N) dp[i][j + distance] += dp[i][j]; 
			}
		}
		
		System.out.print(dp[N-1][N-1]);
	}
}