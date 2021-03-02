import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1254_팰린드롬만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().trim();
		int len = S.length();
		
		for(int i=0;i<len;i++) {
			boolean flag = true;
			
			for(int j=0;j<(len - i)/2;j++) {
				if(S.charAt(i + j) != S.charAt(len - j - 1)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print(len + i);
				return;
			}
		}
	}
}