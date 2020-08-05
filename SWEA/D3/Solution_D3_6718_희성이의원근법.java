import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_6718_희성이의원근법 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int d = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			if(d < 100) answer = 0;
			else if(100 <= d && d < 1000) answer = 1;
			else if(1000 <= d && d < 10000) answer = 2;
			else if(10000 <= d && d < 100000) answer = 3;
			else if(100000 <= d && d < 1000000) answer = 4;
			else answer = 5;
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}