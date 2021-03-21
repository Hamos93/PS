import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1431_시리얼번호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		
		for(int i=0;i<N;i++)
			list.add(br.readLine().trim());
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) return -1;
				else if(o1.length() == o2.length()) {
					int sum1 = 0, sum2 = 0;
					
					for(int i=0;i<o1.length();i++) {
						int value1 = o1.charAt(i) - '0';
						int value2 = o2.charAt(i) - '0';
						
						if(0 <= value1 && value1 <= 9) sum1 += value1;
						if(0 <= value2 && value2 <= 9) sum2 += value2;
					}
					
					if(sum1 < sum2) return -1;
					else if(sum1 == sum2) return o1.compareTo(o2);
				}
				
				return 1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String str : list)
			sb.append(str + "\n");
		
		System.out.print(sb.toString().trim());
	}
}