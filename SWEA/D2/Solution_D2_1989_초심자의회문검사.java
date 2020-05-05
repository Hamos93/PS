import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1989_초심자의회문검사 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			String word = st.nextToken().trim(); 

			StringBuilder sb = new StringBuilder(word);
			
			if(word.equals(sb.reverse().toString())) System.out.println("#" + tc + " " + "1");
			else System.out.println("#" + tc + " " + "0");
		}
	}
}