import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7510_상원이의연속합 {
	private static boolean checkSum(int i, int sum, int N) {
		if(N < sum) return false;
		if(N == sum) return true;
		
		sum += i;
		i++;
		
		return checkSum(i, sum, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());

			int answer = 0;
			for(int i=1;i<=N;i++) {
				int sum = 0;
				if(checkSum(i, sum, N)) answer++;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}