import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2675_문자열반복 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<S.length();i++) {
				for(int j=0;j<R;j++)
					sb.append(S.charAt(i));
			}
			
			System.out.println(sb.toString());
		}
	}
}