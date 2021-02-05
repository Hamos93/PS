import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1965_상자넣기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] box = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++)
			box[i] = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		
		int answer = 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(box[j] < box[i])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
			
			answer = Math.max(answer, dp[i]);
		}
		
		System.out.print(answer);
	}
}