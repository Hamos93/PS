import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D1_2050_알파벳을숫자로변환 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str = st.nextToken().trim().toUpperCase();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			int value = str.charAt(i) - 64;
			sb.append(value + " ");
		}
	
		System.out.print(sb.toString().trim());
	}
}