import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_18310_안테나 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<Integer> home = new ArrayList<>();

		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) home.add(Integer.parseInt(st.nextToken()));
		
		if(N == 1) {
			System.out.print(home.get(0));
			return;
		}
		
		Collections.sort(home);
		
		int idx = 0;
		if(N % 2 == 0) idx = home.size() / 2 - 1;
		else idx = home.size() / 2;
		
		System.out.print(home.get(idx));
	}
}