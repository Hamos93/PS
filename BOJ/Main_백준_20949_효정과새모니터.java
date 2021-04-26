import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_20949_효정과새모니터 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();
		
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
		
			list.add(new int[] { i, (W * W) + (H * H) });
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] < o2[1]) return 1;
				else if(o1[1] == o2[1]) {
					if(o2[0] < o1[0]) return 1;
				}
				
				return -1;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++)
			sb.append(list.get(i)[0] + "\n");
		
		System.out.print(sb.toString().trim());
	}
}