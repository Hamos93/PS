import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_백준_17219_비밀번호찾기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, String> hashMap = new HashMap<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String site = st.nextToken();
			String password = st.nextToken();

			hashMap.put(site, password);
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < M--) {
			String site = br.readLine().trim();
			
			sb.append(hashMap.get(site) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}