import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main_백준_1181_단어정렬 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		Set<String> set = new HashSet<>();

		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		while(N-- > 0) {
			String line = br.readLine();
			set.add(line);
		}
		
		List<String> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				
				if(o1.length() == o2.length()) return o1.compareTo(o2);

				return -1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++)
			sb.append(list.get(i) + "\n");
		
		System.out.print(sb.toString());
	}
}