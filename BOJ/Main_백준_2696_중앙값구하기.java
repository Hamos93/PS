import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2696_중앙값구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			StringBuilder sb = new StringBuilder();
			List<Integer> list = new ArrayList<>();

			st = new StringTokenizer(br.readLine(), " ");

			int M = Integer.parseInt(st.nextToken());
			int line = 0;

			if(M <= 10) line = 1;
			else {
				line = M / 10;
				M %= 10;

				if(M != 0) line++;
			}

			int cnt = 0, mid = 0;
			while(0 < line--) {
				st = new StringTokenizer(br.readLine(), " ");

				while(st.hasMoreTokens()) {
					int value = Integer.parseInt(st.nextToken());
					cnt++;

					list.add(value);

					if(cnt % 2 == 1) {
						Collections.sort(list);

						if(20 < cnt) {
							cnt %= 10;

							sb.append("\n");
						}

						int idx = list.size() / 2;
						sb.append(list.get(idx) + " ");

						mid++;
					}
				}
			}

			System.out.println(mid);
			System.out.println(sb.toString());
		}
	}
}