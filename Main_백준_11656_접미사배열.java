import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_백준_11656_접미사배열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int len = S.length();

		List<String> list = new ArrayList<>();
		for(int i=0;i<len;i++)
			list.add(S.substring(i, len));

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++){
			if(i != list.size() -1) sb.append(list.get(i) + "\n");
			else sb.append(list.get(i));
		}

		System.out.print(sb.toString());
	}
}