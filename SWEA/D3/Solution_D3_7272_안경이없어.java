import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_7272_안경이없어 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String word1 = st.nextToken();
			String word2 = st.nextToken();

			if(word1.length() != word2.length()) {
				System.out.println("#" + tc + " DIFF");
				continue;
			}
			
			int len = word1.length();
			boolean flag = true;
			for(int i=0;i<len;i++) {
				char ch1 = word1.charAt(i);
				char ch2 = word2.charAt(i);
				
				switch (ch1) {
				case 'A':
				case 'D':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
					if(ch2 != 'A' && ch2 != 'D' && ch2 != 'O' && ch2 != 'P' && ch2 != 'Q' && ch2 != 'R') flag = false;
					break;
				case 'B':
					if(ch2 != 'B') flag = false;
					break;
				default:
					if(ch2 == 'A' || ch2 == 'D' || ch2 == 'O' || ch2 == 'P' || ch2 == 'Q' || ch2 == 'R' || ch2 == 'B') flag = false;
					break;
				}
				
				if(!flag) break;
			}
			
			if(flag) System.out.println("#" + tc + " SAME");
			else System.out.println("#" + tc + " DIFF");
		}
	}
}