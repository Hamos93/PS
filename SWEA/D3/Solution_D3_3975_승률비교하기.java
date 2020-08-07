import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3975_승률비교하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double A = Integer.parseInt(st.nextToken());
			double B = Integer.parseInt(st.nextToken());
			double C = Integer.parseInt(st.nextToken());
			double D = Integer.parseInt(st.nextToken());
		
			double ALICE = A / B;
			double BOB = C / D;
		
			if(ALICE < BOB) sb.append("#" + tc + " BOB\n");
			else if(BOB < ALICE) sb.append("#" + tc + " ALICE\n");
			else sb.append("#" + tc + " DRAW\n");
		}
		
		System.out.println(sb.toString());
	}
}