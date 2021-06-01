import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1213_String {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int T = Integer.parseInt(st.nextToken());
			
			String pattern = br.readLine();
			String line = br.readLine();

			int cnt = 0;
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i) != pattern.charAt(0)) continue;
				if(i + pattern.length() - 1 < line.length() && line.substring(i, i + pattern.length()).equals(pattern)) cnt++;
			}
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}