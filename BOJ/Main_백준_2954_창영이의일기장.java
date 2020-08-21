import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2954_창영이의일기장 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] line = br.readLine().trim().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<line.length;i++) {
			sb.append(line[i]);
			
			if(line[i] == 'a' || line[i] == 'e' || line[i] == 'i' || line[i] == 'o' || line[i] == 'u') i += 2;
		}
		
		System.out.print(sb.toString());
	}
}