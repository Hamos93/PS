import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4522_세상의모든팰린드롬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();

			char[] palindrome = line.toCharArray();
			
			int len = palindrome.length;
			if(len % 2 == 1) {
				for(int i=1;i<=len/2;i++) {
					if(palindrome[len/2 - i] == '?' || palindrome[len/2 + i] == '?') {
						palindrome[len/2 - i] = '?';
						palindrome[len/2 + i] = '?';
					}
				}
			}else {
				for(int i=0;i<len/2;i++) {
					if(palindrome[len/2 - i - 1] == '?' || palindrome[len/2 + i] == '?') {
						palindrome[len/2 - i - 1] = '?';
						palindrome[len/2 + i] = '?';
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<len;i++)
				if(palindrome[i] != '?') sb.append(palindrome[i]);
			
			if(sb.toString().equals(sb.reverse().toString())) System.out.println("#" + tc + " Exist");
			else System.out.println("#" + tc + " Not exist");
		}
	}
}