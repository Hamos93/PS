import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8338_계산기 {
	private static int[] num;
	private static int answer;
	
	private static void calculator(int result, int idx, int N) {
		if(idx == N) {
			answer = answer < result ? result : answer;
			return;
		}
		
		calculator(result + num[idx], idx + 1, N);
		calculator(result * num[idx], idx + 1, N);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			num = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			answer = Integer.MIN_VALUE;
			calculator(num[0], 1, N);

			System.out.println("#" + tc + " " + answer);
		}
	}
}