import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1068_트리 {
	private static int N, leaf;
	private static List<Integer>[] graph;
	private static boolean[] visit;
	
	private static void dfs(int node) {
		visit[node] = true;
		
		boolean flag = true;
		for(int next : graph[node]) {
			if(!visit[next]) {
				flag = false;
				dfs(next);
			}
		}
		
		if(flag) leaf++;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		graph = new ArrayList[N];

		for(int i=0;i<N;i++)
			graph[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int root = -1;
		for(int i=0;i<N;i++) {
			int parent = Integer.parseInt(st.nextToken());
			
			if(parent == -1) root = i;
			else {
				graph[parent].add(i);
				graph[i].add(parent);
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int remove = Integer.parseInt(st.nextToken());

		visit = new boolean[N];
		visit[remove] = true;
		
		leaf = 0;
		if(!visit[root])
			dfs(root);
		
		System.out.print(leaf);
	}
}