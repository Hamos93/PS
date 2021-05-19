import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_11736_평범한숫자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int[] P = new int[N];

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++)
				P[i] = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int i=1;i<N-1;i++) {
				int max = Math.max(Math.max(P[i-1], P[i]), P[i+1]);
				int min = Math.min(Math.min(P[i-1], P[i]), P[i+1]);
		
				if(!(max == P[i] || min == P[i])) cnt++;
			}
		
			System.out.println("#" + tc + " " + cnt);
		}
	}
}