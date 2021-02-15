import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_백준_11652_카드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		TreeMap<Long, Integer> map = new TreeMap<>();
		
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			long key = Long.parseLong(st.nextToken());

			if(map.containsKey(key)) map.put(key, map.get(key) + 1);
			else map.put(key, 1);
		}

		long result = 0; int cnt = 0;
		
		Set<Long> set = map.keySet();
		Iterator<Long> keyIterator = set.iterator();
		while(keyIterator.hasNext()) {
			long key = keyIterator.next();
			
			if(cnt < map.get(key)) {
				result = key;
				cnt = map.get(key);
			}
		}
		
		System.out.print(result);
	}
}