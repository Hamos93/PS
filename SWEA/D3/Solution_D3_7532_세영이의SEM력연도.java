import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7532_세영이의SEM력연도 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			int s = 1, e = 1, m = 1, AD = 1;
			while(true) {
				if(S == s && M == m && E == e) break;
				s++; e++; m++;
				
				if(365 < s) s = 1;
				if(24 < e) e = 1;
				if(29 < m) m = 1;
				
				AD++;
			}
			
			System.out.println("#" + tc + " " + AD);
		}
	}
}