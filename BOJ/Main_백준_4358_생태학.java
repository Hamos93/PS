import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main_백준_4358_생태학 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> treeMap = new TreeMap<>();
		int cnt = 0;
	
		while(true) {
			String tree = br.readLine();
			
			if(tree == null || tree.length() == 0) break;
			
			if(treeMap.containsKey(tree)) treeMap.put(tree, treeMap.get(tree) + 1);
			else treeMap.put(tree, 1);
			
			cnt++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		Set<String> keySet = treeMap.keySet();
		for(String tree : keySet) {
			double value = treeMap.get(tree);
			value /= cnt;
			value *= 100;
			
			sb.append(tree + " " + String.format("%.4f", value) + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}