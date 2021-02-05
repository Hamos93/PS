import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_백준_7662_이중우선순위큐 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		while(0 < T--) {
			st = new StringTokenizer(br.readLine(), " ");
			int K = Integer.parseInt(st.nextToken());

			TreeMap<Integer, Integer> treeMap = new TreeMap<>();
			while(0 < K--) {
				st = new StringTokenizer(br.readLine(), " ");

				String command = st.nextToken();
				int key = Integer.parseInt(st.nextToken());

				if(command.equals("I")) {
					if(treeMap.containsKey(key)){
						int value = treeMap.get(key);
						treeMap.put(key, ++value);
					}else treeMap.put(key, 1);
				}else {
					if(treeMap.isEmpty()) continue;

					if(key == -1) {
						if(treeMap.get(treeMap.firstKey()) == 1) treeMap.remove(treeMap.firstKey());
						else treeMap.put(treeMap.firstKey(), treeMap.get(treeMap.firstKey()) - 1);
					}else {
						if(treeMap.get(treeMap.lastKey()) == 1) treeMap.remove(treeMap.lastKey());
						else treeMap.put(treeMap.lastKey(), treeMap.get(treeMap.lastKey()) - 1);
					}
				}
			}
			
			if(treeMap.isEmpty()) sb.append("EMPTY" + "\n");
			else sb.append(treeMap.lastKey() + " " + treeMap.firstKey() + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}