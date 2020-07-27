import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_3233_정삼각형분할놀이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double A = Integer.parseInt(st.nextToken());
			double B = Integer.parseInt(st.nextToken());
		
			if(A == B) {
				System.out.println("#" + tc + " 1");
				continue;
			}
			
			double areaA = (A * (A / 2)) / 2;
			double areaB = (B * (B / 2)) / 2;
		
			System.out.println("#" + tc + " " + (long)(areaA / areaB));
		}
	}
}