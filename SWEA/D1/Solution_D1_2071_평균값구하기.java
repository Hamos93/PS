import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2071_평균값구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) { 
			st = new StringTokenizer(br.readLine(), " ");
			
			double answer = 0;
			while(st.hasMoreTokens()) answer += Integer.parseInt(st.nextToken());
			
			System.out.println("#" + tc + " " + (Math.round(answer/10)));
		}
	}
}