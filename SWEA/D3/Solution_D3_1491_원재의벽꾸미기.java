import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1491_원재의벽꾸미기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			long N = Integer.parseInt(st.nextToken());
			long A = Integer.parseInt(st.nextToken());
			long B = Integer.parseInt(st.nextToken());
		
			long min = Long.MAX_VALUE;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=i;j++) {
					if(N < i * j) break;
					
					if(i * j <= N) {
						long result = A * (int)(Math.abs(i - j)) + B * (N - (i * j));
						
						min = result < min ? result : min;
					}
				}
			}
			
			sb.append("#" + tc + " " + min + "\n");
		}
		
		System.out.print(sb.toString());
	}
}