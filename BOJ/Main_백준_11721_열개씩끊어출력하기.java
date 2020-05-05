import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_11721_열개씩끊어출력하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine().trim();
		StringBuilder sb = new StringBuilder();
		
		int cnt = 1;
		for(int i=0;i<line.length();i++){
			if(cnt == 10) {
				sb.append(line.charAt(i) + "\n");
				cnt = 0;
			}else sb.append(line.charAt(i));
			
			cnt++;
		}
		
		System.out.print(sb.toString());
	}
}