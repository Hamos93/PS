import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4299_태혁이의사랑은타이밍 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		
		int time = (11 * 24 * 60) + (11 * 60) + 11;
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int D = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			if((D == 11 && H < 11) || (D == 11 && H == 11 && M < 11)) {
				sb.append("#" + tc + " -1\n");
				continue;
			}
			
			int result = (D * 24 * 60) + (H * 60) + M;
			sb.append("#" + tc + " " + (result - time) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}