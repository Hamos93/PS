import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8457_알덴테스파게티 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			int range1 = B - E, range2 = B + E, cnt = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				int x = Integer.parseInt(st.nextToken());
				
				boolean flag = false;
				int k = 1, second = x;
				while(second <= range2) {
					if(range1 <= second && second <= range2) {
						flag = true;
						break;
					}

					k++;
					second = k * x;
				}
				
				if(flag) cnt++;
			}
		
			System.out.println("#" + tc + " " + cnt);
		}
	}
}