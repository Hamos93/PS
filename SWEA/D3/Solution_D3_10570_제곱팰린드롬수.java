import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10570_제곱팰린드롬수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			int cnt = 0;
			for(int i=A;i<=B;i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(i);
				
				if(!sb.toString().equals(sb.reverse().toString())) continue;
				
				double sqrtN = Math.sqrt(i);
				if(sqrtN != (int)sqrtN) continue;
				
				sb = new StringBuilder();
				sb.append((int)sqrtN);
				
				if(sb.toString().equals(sb.reverse().toString())) cnt++;
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}
}