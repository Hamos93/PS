import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1967_트리의지름 {
	private static int n, len, diameter;
	private static List<int[]>[] graph;
	private static boolean[] visit;

	public static void dfs(int node) {
		if(diameter < len) diameter = len;

		for(int[] get : graph[node]) {
			if(!visit[get[0]]) {
				int next = get[0];
				int w = get[1];

				len += w;
				visit[next] = true;

				dfs(next);

				visit[next] = false;
				len -= w;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());

		graph = new ArrayList[n + 1];
		for(int i=1;i<=n;i++)
			graph[i] = new ArrayList<>();

		int k = n - 1;
		while(0 < k--) {
			st = new StringTokenizer(br.readLine(), " ");

			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			graph[parent].add(new int[] { child, weight });
			graph[child].add(new int[] { parent, weight });
		}


		diameter = len = 0;
		visit = new boolean[n + 1];
		for(int i=1;i<=n;i++) {
			visit[i] = true;

			dfs(i);

			visit[i] = false;
		}

		System.out.print(diameter);
	}
}