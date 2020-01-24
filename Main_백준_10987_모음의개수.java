import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10987_모음의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int answer = 0;
		for(int i=0;i<S.length();i++)
			if(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' || S.charAt(i) == 'o' || S.charAt(i) == 'u') answer++;
		
		System.out.print(answer);
	}
}