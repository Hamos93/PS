import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_18353_병사배치하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[N];
		Arrays.fill(dp, 1);
		
		int max = 0;
		for(int i=1;i<N;i++) {
			for(int j=0;j<i;j++)
				if(arr[i] < arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
		
			max = Math.max(max, dp[i]);
		}
		
		if(N == 1) System.out.print("0");
		else System.out.print(N - max);
	}
}