import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8016_홀수피라미드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			long N = Long.parseLong(st.nextToken()); 
			
			// 왼쪽, 오른쪽 수열 점화식
			long leftSequence = 1 + 2 * (N - 1) * (N - 1);
			long rightSequence = 1 + 2 * (N - 1) * (N + 1);
			
			System.out.println("#" + tc + " " + leftSequence + " " + rightSequence);
		}
	}
}