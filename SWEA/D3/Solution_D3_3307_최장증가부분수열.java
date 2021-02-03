import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_3307_최장증가부분수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				arr[i] = Integer.parseInt(st.nextToken());
			
			int[] dp = new int[N];
			
			Arrays.fill(dp, 1);
			
			int answer = 1;
			for(int i=0;i<N;i++) {
				for(int j=0;j<i;j++) {
					if(arr[j] < arr[i]) {
						dp[i] = Math.max(dp[i], dp[j] + 1);
						answer = Math.max(answer, dp[i]);
					}
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}