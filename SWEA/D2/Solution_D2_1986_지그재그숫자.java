import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1986_지그재그숫자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int answer = 0;
			
			int N = Integer.parseInt(st.nextToken());
			for(int i=1;i<=N;i++) {
				if(i % 2 == 1) answer += i;
				else answer -= i;
			}
			
			sb.append("#" + tc + " " + answer + "\n");
		}
		
		System.out.print(sb.toString());
	}
}