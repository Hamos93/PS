import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_11816_8진수10진수16진수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine().trim();

		int len = X.length(), answer = 0;
		if(X.charAt(0) == '0' && X.charAt(1) == 'x') {
			for(int i=0;i<len-2;i++) {
				if(97 <= X.charAt(len - i - 1) && X.charAt(len - i - 1) <= 102) answer += (X.charAt(len - i - 1) - 87) * (int)(Math.pow(16, i));
				else answer += (X.charAt(len - i - 1) - '0') * (int)(Math.pow(16, i));
			}
			System.out.print(answer);
		}else if(X.charAt(0) == '0') {
			for(int i=0;i<len-1;i++)
				answer += (X.charAt(len - i - 1) - '0') * (int)(Math.pow(8, i));

			System.out.print(answer);
		}else System.out.println(X);
	}
}