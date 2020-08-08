import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9940_순열1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			
			int range = 100000;
			boolean[] sequence = new boolean[range + 1];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			boolean flag1 = true;
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				
				if(sequence[num]) {
					flag1 = false;
					break;
				}else sequence[num] = true;
			}
			
			if(!flag1) {
				sb.append("#" + tc + " No\n");
				continue;
			}
			
			boolean flag2 = true;
			for(int i=1;i<=N;i++) {
				if(!sequence[i]) {
					flag2 = false;
					break;
				}
			}
			
			if(!flag2) sb.append("#" + tc + " No\n");
			else sb.append("#" + tc + " Yes\n");
		}
		
		System.out.print(sb.toString());
	}
}