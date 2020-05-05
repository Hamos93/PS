import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_9086_문자열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			String str = br.readLine().trim();
			
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(0));
			sb.append(str.charAt(str.length() - 1));
			
			System.out.println(sb.toString());
		}
	}
}