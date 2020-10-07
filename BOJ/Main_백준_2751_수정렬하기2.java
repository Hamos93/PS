import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_백준_2751_수정렬하기2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Set<Integer> treeSet = new TreeSet<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			treeSet.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		for(int value : treeSet)
			sb.append(value + "\n");
		
		System.out.print(sb.toString().trim());
	}
}