import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_1764_듣보잡 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		TreeSet<String> treeSet1 = new TreeSet<>();
		while(0 < N--) {
			String name = br.readLine().trim();
			treeSet1.add(name);
		}
		
		TreeSet<String> treeSet2 = new TreeSet<>();
		while(0 < M--) {
			String name = br.readLine().trim();
			
			if(treeSet1.contains(name)) treeSet2.add(name);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(treeSet2.size() + "\n");
		
		for(String name : treeSet2)
			sb.append(name + "\n");
		
		System.out.print(sb.toString());
	}
}