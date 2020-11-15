import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_백준_20124_모르고리즘회장님추천받습니다 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		Map<String, Integer> treeMap = new TreeMap<>();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			treeMap.put(name, score);
		}

		Set<String> keySet = treeMap.keySet();
		int max = 0;
		for(String name : keySet) {
			int score = treeMap.get(name);
			
			max = Math.max(max, score);
		}
		
		for(String name : keySet) {
			int score = treeMap.get(name);
			
			if(score == max) {
				System.out.print(name);
				return;
			}
		}
	}
}