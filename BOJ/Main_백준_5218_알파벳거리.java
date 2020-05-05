import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_5218_알파벳거리 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String str1 = st.nextToken();
			String str2 = st.nextToken();

			int len = str1.length();
			
			StringBuilder sb = new StringBuilder();
			sb.append("Distances: ");
			for(int i=0;i<len;i++){
				int ch1 = str1.charAt(i) - 64;
				int ch2 = str2.charAt(i) - 64;
				
				if(ch1 <= ch2) sb.append((ch2 - ch1) + " ");
				else sb.append((ch2 + 26 - ch1) + " ");
			}
			
			System.out.println(sb.toString());
		}
	}
}