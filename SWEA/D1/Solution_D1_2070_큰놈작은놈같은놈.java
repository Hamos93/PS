import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2070_큰놈작은놈같은놈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
		
			sb.append("#" + tc + " ");
			if(num1 == num2) {
				sb.append("=" + "\n");
				continue;
			}
			
			char answer = (num1 < num2) ? '<' : '>';
			sb.append(answer + "\n");
		}
		
		System.out.print(sb.toString());
	}
}