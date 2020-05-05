import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1217_°ÅµìÁ¦°ö {
	private static int pow(int n, int m) {
		if(m == 0) return 1;
		return n * pow(n, m-1);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int t = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int result = pow(N, M);
			sb.append("#" + t + " " + result + "\n");
		}
		
		System.out.print(sb.toString());
	}
}