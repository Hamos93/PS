import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1946_신입사원 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
	
			List<int[]> list = new ArrayList<>();
			while(0 < N--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				list.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
			}

			Collections.sort(list, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[0] > o2[0]) return 1;
	
					return -1;
				}
			});
			
			int cnt = 1, size = list.size(), interview = list.get(0)[1];
			for(int i=1;i<size;i++) {
				if(list.get(i)[1] < interview) {
					cnt++;
					
					interview = list.get(i)[1];
				}
			}
			
			System.out.println(cnt);
		}
	}
}