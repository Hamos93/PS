import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_14425_문자열집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Set<String> hashSet = new HashSet<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			hashSet.add(st.nextToken());
		}
		
		int cnt = 0;
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			String word = st.nextToken();
			
			if(hashSet.contains(word)) cnt++;
		}
		
		System.out.print(cnt);
	}
}