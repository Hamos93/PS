import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2711_오타맨고창영 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int idx = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			sb.append(str.substring(0, idx-1));
			sb.append(str.substring(idx, str.length()));
			
			System.out.println(sb.toString());
		}
	}
}