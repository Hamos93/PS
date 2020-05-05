import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2068_최대수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int answer = 0;
			while(st.hasMoreTokens()) {
				int value = Integer.parseInt(st.nextToken());
				answer = answer < value ? value : answer; 
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}