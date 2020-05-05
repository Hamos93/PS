import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2744_대소문자바꾸기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().trim().toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<ch.length;i++){
			if('a' <= ch[i] && ch[i] <= 'z') ch[i] = (char)(ch[i] - 32);
			else ch[i] = (char)(ch[i] + 32);
			
			sb.append(ch[i]);
		}
		
		System.out.print(sb.toString());
	}
}