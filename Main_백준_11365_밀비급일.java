import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_11365_밀비급일 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		
		while(true){
			String line = br.readLine().trim();
			sb = new StringBuilder();
			
			if(line.equals("END")) break;
			
			line = sb.append(line).reverse().toString();
			System.out.println(line);
		}
	}
}