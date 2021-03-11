import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_11060_점프점프 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[N];
		
		Arrays.fill(dp, 100000);
		
		dp[0] = 0;
		for(int i=0;i<N-1;i++) {
			int jump = A[i];
			for(int j=i+1;j<=i+jump;j++) {
				if(j <= N-1) dp[j] = Math.min(dp[j], dp[i] + 1);
			}
		}
		
		if(dp[N-1] == 100000) System.out.print("-1");
		else System.out.print(dp[N-1]);
	}
}