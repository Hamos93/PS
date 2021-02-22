import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13417_카드문자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			String result = st.nextToken();
			
			while(st.hasMoreTokens()) {
				String str = st.nextToken();
				if((str + result).compareTo(result + str) <= 0) result = str + result;
				else result = result + str;
			}
			
			sb.append(result + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}