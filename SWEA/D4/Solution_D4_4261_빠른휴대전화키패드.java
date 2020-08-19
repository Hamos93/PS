import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_4261_빠른휴대전화키패드 {
	public static void main(String[] args) throws Exception {
		String[] keypad = { null, null, "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			String S = st.nextToken();
			int N = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");

			int cnt = 0;
			while(st.hasMoreTokens()) {
				String word = st.nextToken();
				int len = word.length() <= S.length() ? word.length() : S.length();
				
				int idx = 0;
				boolean flag = true;
				loop: for(int i=0;i<len;i++) {
					int key = S.charAt(i) - '0';

					if(!keypad[key].contains(word.substring(idx, idx + 1))) {
						flag = false;
						break loop;
					}
					
					idx++;
				}
				
				if(flag) cnt++;
			}

			System.out.println("#" + tc + " " + cnt);
		}
	}
}