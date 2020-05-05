import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_11651_좌표정렬하기2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new int[] {x, y});
		}

		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 1. y좌표가 증가하는 순
				if(o2[1] < o1[1]) return 1;
				else if(o1[1] == o2[1])
					// 2. y좌표가 같으면 x좌표가 증가하는 순
					if(o2[0] < o1[0]) return 1;
				
				return -1;
			}
		});

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
	}
}