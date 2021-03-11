import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_8394_악수 {
	public static void main(String[] args) throws Exception {
		int[] dp = new int[10000001];
		dp[1] = 1; dp[2] = 2;
		
		for(int i=3;i<=10000000;i++)
			dp[i] = (dp[i-1] + dp[i-2]) % 10;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String result = Long.toString(dp[n]);
		System.out.print(result.charAt(result.length() - 1));
	}
}