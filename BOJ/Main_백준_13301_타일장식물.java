import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13301_타일장식물 {
	public static void main(String[] args) throws Exception {
		long[] dp = new long[81];
		dp[0] = 1; dp[1] = 1;
		
		for(int i=2;i<=80;i++)
			dp[i] = dp[i-1] + dp[i-2];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		long answer = (dp[N-1] + dp[N]) * 2;
		
		System.out.print(answer);
	}
}