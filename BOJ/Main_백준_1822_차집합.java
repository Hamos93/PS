import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_1822_차집합 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Set<Integer> treeSet = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens())
			treeSet.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int value = Integer.parseInt(st.nextToken());
			
			if(treeSet.contains(value))
				treeSet.remove(value);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(treeSet.size() + "\n");
		
		for(int value : treeSet)
			sb.append(value + " ");
		
		System.out.print(sb.toString().trim());
	}
}