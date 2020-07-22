import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10505_소득불균형 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());

			int[] income = new int[N];
			int total = 0;

			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<N;i++) {
				income[i] = Integer.parseInt(st.nextToken());
				
				total += income[i];
			}
			
			int cnt = 0;
			for(int i=0;i<N;i++)
				if(income[i] <= (total / N)) cnt++;
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}