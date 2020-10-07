import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_11931_수정렬하기4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int value : list)
			sb.append(value + "\n");
		
		System.out.print(sb.toString().trim());
	}
}