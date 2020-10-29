import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_10912_외로운문자 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String input = br.readLine();
			
			char[] alphabet = new char[26];
			for(int i=0;i<input.length();i++) {
				char ch = input.charAt(i);
	
				if(alphabet[ch - 97] == 0) alphabet[ch - 97]++;
				else alphabet[ch - 97]--;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			
			boolean flag = false;
			for(int i=0;i<26;i++) {
				if(0 < alphabet[i]) {
					flag = true;
					
					while(0 < alphabet[i]--) sb.append((char)(i + 97));
				}
			}
			
			if(!flag) sb.append("Good");
			System.out.println(sb.toString());
		}
	}
}