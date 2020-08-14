import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1486_장훈이의높은선반 {
	private static int[] height;
	private static int answer;

	public static void tower(int idx, int sum, int N, int B) {
		if(idx == N) {
			if(B <= sum && sum - B < answer) answer = sum - B;
			
			return;
		}
		
		tower(idx + 1, sum + height[idx], N, B);
		tower(idx + 1, sum, N, B);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			height = new int[N];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				height[i] = Integer.parseInt(st.nextToken());
			
			answer = Integer.MAX_VALUE;
			tower(0, 0, N, B);
	
			System.out.println("#" + tc + " " + answer);
		}
	}
}