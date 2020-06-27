import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9700_USB꽂기의미스터리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double p = Double.parseDouble(st.nextToken());
			double q = Double.parseDouble(st.nextToken());
		
			// s1 = 처음에 USB를 뒤집어서 꽂았을 확률 * 뒤집어서 제대로 꽂아질 확률 
			double s1 = (1-p) * q;
			
			// s2 = 처음에 USB를 올바르게 꽂았지만 실패할 확률 * 2번 뒤집어서 제대로 꽂아질 확률
			double s2 = p * (1-q) * q;
			
			if(s1 < s2) System.out.println("#" + tc + " YES");
			else System.out.println("#" + tc + " NO");
		}
	}
}