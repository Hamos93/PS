import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2587_대표값2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int i=1;i<=5;i++){
			st = new StringTokenizer(br.readLine(), " ");
			
			int value = Integer.parseInt(st.nextToken());
			sum += value;
			
			list.add(value);
		}
		
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 > o2) return 1;
				return -1;
			}
		});

		System.out.print(sum/5 + "\n" + list.get(2));
	}
}