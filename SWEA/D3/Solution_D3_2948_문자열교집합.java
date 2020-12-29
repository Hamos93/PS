import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution_D3_2948_문자열교집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
		
			Set<String> hashSet = new HashSet<>();

			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) 
				hashSet.add(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
	
			int cnt = 0;
			while(st.hasMoreTokens()) {
				String value = st.nextToken();
				if(hashSet.contains(value)) {
					hashSet.remove(value);
					cnt++;
				}
			}
			
			sb.append("#" + tc + " " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
	}
}