import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_백준_2789_유학금지 {
	private static char[] censor = { 'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E' };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<line.length();i++) {
			boolean flag = true;
			for(int j=0;j<censor.length;j++) {
				if(line.charAt(i) == censor[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) sb.append(line.charAt(i));
		}
		
		System.out.print(sb.toString());
	}
}