import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_백준_1302_베스트셀러 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> treeMap = new TreeMap<>();
		while(0 < N--) {
			String book = br.readLine().trim();
			
			if(!treeMap.containsKey(book)) treeMap.put(book, 1);
			else {
				int cnt = treeMap.get(book);
				treeMap.put(book, cnt + 1);
			}
		}
		
		Set<String> keySet = treeMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		String book = ""; int cnt = 0;
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = treeMap.get(key);
			
			if(cnt < value) {
				cnt = value;
				book = key;
			}
		}
		
		System.out.print(book);
	}
}