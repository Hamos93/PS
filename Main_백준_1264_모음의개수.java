import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1264_모음의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String line = br.readLine().toLowerCase().trim();
			
			if(line.charAt(0) == '#') break;
			
			int answer = 0;
			for(int i=0;i<line.length();i++)
				if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') answer++;
		
			System.out.println(answer);
		}
	}
}