import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_11856_반반 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			String S = br.readLine();
			int[] alphabet = new int[26];

			for(int i=0;i<4;i++)
				alphabet[S.charAt(i) - 65]++;
			
			int cnt = 0;
			for(int i=0;i<26;i++) {
				if(alphabet[i] == 2) cnt++;
			}
			
			if(cnt == 2) sb.append("#" + tc + " Yes\n");
			else sb.append("#" + tc + " No\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}