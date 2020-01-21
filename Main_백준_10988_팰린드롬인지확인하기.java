import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_10988_팰린드롬인지확인하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine().trim();
		StringBuilder sb = new StringBuilder(line);
		
		if(sb.toString().equals(sb.reverse().toString())) System.out.print("1");
		else System.out.print("0");
	}
}