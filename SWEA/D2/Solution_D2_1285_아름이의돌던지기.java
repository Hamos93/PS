import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1285_아름이의돌던지기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int distance = Integer.MAX_VALUE;
			int cnt = 0;
			
			while(st.hasMoreTokens()) {
				int value = Math.abs(Integer.parseInt(st.nextToken()));
				
				if(value < distance) {
					distance = value;
					cnt = 1;
				}else if(value == distance) cnt++;
			}
			
			System.out.println("#"+ tc + " " + distance + " " + cnt);
		}
	}
}