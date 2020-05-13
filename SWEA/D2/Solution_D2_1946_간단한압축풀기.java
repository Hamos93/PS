import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1946_간단한압축풀기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int totalCnt = 0;

			sb.append("#" + tc + "\n");
			while(N-- > 0) {
				st = new StringTokenizer(br.readLine(), " ");
				
				String alphabet = st.nextToken();
				int cnt = Integer.parseInt(st.nextToken());
				while(cnt-- > 0) {
					sb.append(alphabet);
					
					++totalCnt;
					
					if(totalCnt == 10) {
						sb.append("\n");
						totalCnt = 0;
					}
				}
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}