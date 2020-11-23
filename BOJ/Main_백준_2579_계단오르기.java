import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2579_계단오르기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int[] stairs = new int[301];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			stairs[i] = Integer.parseInt(st.nextToken());
		}
		
		// dp[i]: i번째 계단을 밟았을 때 얻을 수 있는 점수의 최댓값
		int[] dp = new int[301];
		dp[1] = stairs[1];
		dp[2] = stairs[1] + stairs[2];
		
		for(int i=3;i<=N;i++)
			dp[i] = Math.max(stairs[i] + dp[i - 2], stairs[i] + stairs[i - 1] + dp[i - 3]);
		
		System.out.print(dp[N]);
	}
}