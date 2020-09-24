import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_백준_1931_회의실배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());

		ArrayList<int[]> list = new ArrayList<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list.add(new int[] { start, end });
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] > o2[1]) return 1;
				else if(o1[1] == o2[1]) {
					if(o1[0] > o2[0]) return 1;
				}
				
				return -1;
			}
		});
		
		int end = -1, cnt = 0, size = list.size();
		for(int i=0;i<size;i++) {
			if(end <= list.get(i)[0]) {
				end = list.get(i)[1];
				
				cnt++;
			}
		}
		
		System.out.print(cnt);
	}
}