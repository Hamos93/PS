import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10174_팰린드롬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int n = Integer.parseInt(st.nextToken());
		while(0 < n--) {
			String line = br.readLine().toUpperCase().trim();
			
			StringBuilder palindrome = new StringBuilder(line);
			if(line.equals(palindrome.reverse().toString())) sb.append("Yes\n");
			else sb.append("No\n");
		}
		
		System.out.print(sb.toString());
	}
}