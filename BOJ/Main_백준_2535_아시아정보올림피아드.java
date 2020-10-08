import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2535_아시아정보올림피아드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		List<int[]> list = new ArrayList<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int nation = Integer.parseInt(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
		
			list.add(new int[] { nation, id, score });
		}
		
		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2] < o2[2]) return 1;

				return -1;
			}
		});

		System.out.println(list.get(0)[0] + " " + list.get(0)[1]);
		System.out.println(list.get(1)[0] + " " + list.get(1)[1]);
		
		for(int i=2;i<list.size();i++) {
			if((list.get(i)[0] == list.get(0)[0]) && (list.get(i)[0] == list.get(1)[0])) continue;
			else{
				System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
				break;
			}
		}
	}
}