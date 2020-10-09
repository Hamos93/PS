import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2012_등수매기기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int idx = Integer.parseInt(st.nextToken());
			
			list.add(idx);
		}

		Collections.sort(list);
		
		long result = 0;
		for(int i=1;i<=N;i++)
			result += Math.abs(i - list.get(i - 1));
		
		System.out.print(result);
	}
}