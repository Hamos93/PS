import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1439_뒤집기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().trim();
		int len = S.length();
		
		int zero = 0, one = 0, pre = 0;
		for(int i=0;i<len;i++) {
			if(i == 0) {
				if(0 == S.charAt(i) - '0') zero++;
				else one++;
				
				pre = S.charAt(i) - '0';
			
				continue;
			}
			
			if(pre == S.charAt(i) - '0') continue;
			else {
				if(0 == S.charAt(i) - '0') zero++;
				else one++;
				
				pre = S.charAt(i) - '0';
			}
		}
		
		System.out.print(Math.min(zero, one));
	}
}