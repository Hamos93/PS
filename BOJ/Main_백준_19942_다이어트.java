import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_19942_다이어트 {
	private static int N;
	private static int mp, mf, ms, mv;
	private static List<int[]> list;
	private static boolean[] visit;
	private static int price;
	private static StringBuilder sb;
	
	public static void dfs(int idx, int p, int f, int s, int v, int c) {
		if(mp <= p && mf <= f && ms <= s && mv <= v && c < price) {
			sb = new StringBuilder();

			price = Math.min(price, c);
			
			sb.append(price + "\n");
			
			for(int i=0;i<N;i++) {
				if(visit[i]) sb.append((i+1) + " ");
			}
			
			return;
		}

		for(int i=idx;i<N;i++) {
			if(!visit[i]) {
				visit[i] = true;
				
				p += list.get(i)[0];
				f += list.get(i)[1];
				s += list.get(i)[2];
				v += list.get(i)[3];
				c += list.get(i)[4];

				dfs(idx + 1, p, f, s, v, c);

				visit[i] = false;
				
				c -= list.get(i)[4];
				v -= list.get(i)[3];
				s -= list.get(i)[2];
				f -= list.get(i)[1];
				p -= list.get(i)[0];
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		mp = Integer.parseInt(st.nextToken());
		mf = Integer.parseInt(st.nextToken());
		ms = Integer.parseInt(st.nextToken());
		mv = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int p = Integer.parseInt(st.nextToken());
			int f = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			list.add(new int[] { p, f, s, v, c });
		}

		visit = new boolean[N];
		price = Integer.MAX_VALUE;

		dfs(0, 0, 0, 0, 0, 0);

		if(price == Integer.MAX_VALUE) System.out.print("-1");
		else System.out.print(sb.toString().trim());
	}
}