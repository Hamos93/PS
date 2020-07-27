import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4789_성공적인공연기획 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String audience = br.readLine().trim();
			audience = "0" + audience;
			
			int total = 0, answer = 0;
			for(int i=1;i<audience.length();i++) {
				if(audience.charAt(i) == '0') continue;
				
				if((i-1) < total) total += audience.charAt(i) - '0';
				else {
					int cnt = (i-1) - total;
					
					answer += cnt;

					total += cnt;
					total += audience.charAt(i) - '0';
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}