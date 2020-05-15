import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6913_동철이의프로그래밍대회 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			
			int[] participant = new int[N + 1];
			int max = Integer.MIN_VALUE;
			for(int i=1;i<N+1;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int score = 0;
				for(int j=0;j<M;j++)
					score += Integer.parseInt(st.nextToken());

				participant[i] = score;
				max = max < participant[i] ? participant[i] : max;
			}
			
			int cnt = 0;
			for(int i=1;i<N+1;i++)
				if(max == participant[i]) cnt++;

			System.out.println("#" + tc + " " + cnt + " " + max);
		}
	}
}