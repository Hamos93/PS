import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_2007_패턴마디의길이_2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String line = br.readLine().trim();
			
			for(int i=1;i<=10;i++) {
				String pattern = line.substring(0, i);
				String compare = line.substring(i, i + i);
				
				if(pattern.equals(compare)) {
					System.out.println("#" + tc + " " + pattern.length());
					break;
				}
			}
		}
	}
}