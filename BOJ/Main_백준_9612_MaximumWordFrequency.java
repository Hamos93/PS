import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_9612_MaximumWordFrequency {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> hashMap = new HashMap<>();
		while(0 < n--) {
			String word = br.readLine().trim();
			
			if(hashMap.containsKey(word)) {
				int value = hashMap.get(word);
				hashMap.put(word, value + 1);
			}else hashMap.put(word, 1);
		}
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		String word = ""; int cnt = 0;
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = hashMap.get(key);
			
			if(cnt < value) {
				cnt = value;
				word = key;
			}
		}
		
		System.out.print(word + " " + cnt);
	}
}