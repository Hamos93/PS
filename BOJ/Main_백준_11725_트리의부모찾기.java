import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_11725_트리의부모찾기 {
	private static List<Integer>[] graph;
	private static int[] visit;
	
	private static void dfs(int node) {
		for(int next : graph[node]) {
			if(visit[next] == 0) {
				visit[next] = node;
				
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			graph[i] = new ArrayList<>();

		for(int i=1;i<=N-1;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph[u].add(v);
			graph[v].add(u);
		}

		visit = new int[N + 1];
		dfs(1);
		
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<=N;i++)
			sb.append(visit[i] + "\n");
		
		System.out.print(sb.toString());
	}
}