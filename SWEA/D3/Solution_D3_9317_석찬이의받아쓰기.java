import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_9317_석찬이의받아쓰기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			String word1 = br.readLine().trim();
			String word2 = br.readLine().trim();

			int cnt = 0;
			for(int i=0;i<N;i++)
				if(word1.charAt(i) == word2.charAt(i)) cnt++;
		
			System.out.println("#" + tc + " " + cnt);
		}
	}
}