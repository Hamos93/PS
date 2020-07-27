import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6853_직사각형과점 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
		
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());
			
			int[] cnt = new int[3];
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
			
				if((x1 <= x && x <= x2) && (y1 <= y && y <= y2)) {
					if((x == x1 || x == x2) || (y == y1 || y == y2)) cnt[1]++;
					else cnt[0]++;
				}else cnt[2]++;
			}
			
			System.out.println("#" + tc + " " + cnt[0] + " " + cnt[1] + " " + cnt[2]);
		}
	}
}