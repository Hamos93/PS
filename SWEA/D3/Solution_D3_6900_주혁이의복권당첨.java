import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_D3_6900_주혁이의복권당첨 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			List<String[]> lottery = new ArrayList<>();
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				lottery.add(new String[] {st.nextToken(), st.nextToken()});
			}
			
			int answer = 0;
			while(0 < M--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				String str = st.nextToken();

				for(int i=0;i<lottery.size();i++) {
					String digit = lottery.get(i)[0];
					
					boolean flag = true;
					for(int j=0;j<8;j++) {
						if(digit.charAt(j) == '*') continue;
						if(digit.charAt(j) != str.charAt(j)) {
							flag = false;
							break;
						}
					}
					
					if(flag) {
						answer += Integer.parseInt(lottery.get(i)[1]);
						
						break;
					}
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}