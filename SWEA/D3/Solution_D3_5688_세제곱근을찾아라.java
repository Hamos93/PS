import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_5688_세제곱근을찾아라 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			long N = Long.parseLong(st.nextToken());
			long result = (long)Math.cbrt(N);
			
			if(result == Math.cbrt(N)) System.out.println("#" + tc + " " + result);
			else System.out.println("#" + tc + " -1");
		}
	}
}