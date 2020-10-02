import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2605_줄세우기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=N;i++) {
			int idx = Integer.parseInt(st.nextToken());
			
			list.add(list.size() - idx, i);
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++)
			sb.append(list.get(i) + " ");
		
		System.out.print(sb.toString().trim());
	}
}