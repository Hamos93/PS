import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_9375_패션왕신해빈 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());

			HashMap<String, Integer> hashMap = new HashMap<>();
			while(0 < n--) {
				st = new StringTokenizer(br.readLine(), " ");
				st.nextToken();
		
				String key = st.nextToken();
			
				if(!hashMap.containsKey(key)) hashMap.put(key, 1);
				else {
					int value = hashMap.get(key);
					hashMap.put(key, value + 1);
				}
			}
			
			int cnt = 1;
			Set<String> keySet = hashMap.keySet();
			Iterator<String> keyIterator = keySet.iterator();
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
				int value = hashMap.get(key);
				
				cnt *= value + 1;
			}
			
			System.out.println(cnt - 1);
		}
	}
}