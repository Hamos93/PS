import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2109_순회강연 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();

		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int p = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			list.add(new int[] { p, d });
		}

		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] < o2[0]) return 1;
				if(o1[0] == o2[0]) {
					if(o1[1] < o2[1]) return 1;
				}

				return -1;
			}
		});

		boolean[] visit = new boolean[10001];
		int result = 0;
		
		for(int i=0;i<n;i++) {
			int[] get = list.get(i);
			for(int j=get[1];1<=j;j--) {
				if(!visit[j]) {
					visit[j] = true;
					result += get[0];

					break;
				}
			}
		}

		System.out.print(result);
	}
}