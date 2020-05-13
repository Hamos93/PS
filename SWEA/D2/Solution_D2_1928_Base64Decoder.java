import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.StringTokenizer;

public class Solution_D2_1928_Base64Decoder {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String encoded = st.nextToken().trim();
			String decoded = new String(Base64.getDecoder().decode(encoded));
			System.out.println("#" + tc + " " + decoded);
		}
	}
}