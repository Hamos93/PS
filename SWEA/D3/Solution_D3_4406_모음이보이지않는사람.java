import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4406_모음이보이지않는사람 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
		
			String word = st.nextToken().trim();
			
			sb.append("#" + tc + " ");
			for(int i=0;i<word.length();i++) {
				if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') continue;
					
				sb.append(word.charAt(i));
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
}