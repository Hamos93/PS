import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11024_더하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
		
			int result = 0;
			while(st.hasMoreTokens()) result += Integer.parseInt(st.nextToken());
			
			System.out.println(result);
		}
	}
}