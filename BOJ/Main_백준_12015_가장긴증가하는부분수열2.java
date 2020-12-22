import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_12015_가장긴증가하는부분수열2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
		list.add(0);
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(list.get(list.size() - 1) < value) list.add(value);
			else {
				int low = 0, high = list.size() - 1;
				while(low < high) {
					int mid = (low + high) / 2;
				
					if(value <= list.get(mid)) high = mid;
					else low = mid + 1;
				}
				
				list.set(high, value);
			}
		}
		
		System.out.print(list.size() - 1);
	}
}