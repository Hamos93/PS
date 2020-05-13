import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8741_두문자어 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String[] word = br.readLine().toUpperCase().split(" ");
		
			System.out.println("#" + tc + " " + word[0].charAt(0) + word[1].charAt(0) + word[2].charAt(0));
		}
	}
}