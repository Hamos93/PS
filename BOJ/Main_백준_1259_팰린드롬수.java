import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_1259_팰린드롬수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String line = br.readLine().trim();
			
			if(line.charAt(0) - '0' == 0) break;
			
			StringBuilder sb = new StringBuilder(line);
			if(sb.toString().equals(sb.reverse().toString())) System.out.println("yes");
			else System.out.println("no");
		}
	}
}