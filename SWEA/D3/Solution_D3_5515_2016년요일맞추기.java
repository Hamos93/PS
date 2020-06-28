import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5515_2016년요일맞추기 {
	private static final int[] FIRST_DAY = { -1, 4, 0, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3 };
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			int day = FIRST_DAY[m];
			d = (d - 1) % 7;
			
			System.out.println("#" + tc + " " + ((day + d) % 7));
		}
	}
}