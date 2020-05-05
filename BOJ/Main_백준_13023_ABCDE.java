import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_13023_ABCDE {
	private static int N, M;
	private static List<Integer>[] adjList;
	private static boolean[] visit;
	private static boolean flag;
	
	private static void dfs(int node, int cnt){
		if(cnt == 5){
			flag = true;
			return;
		}
		
		for(int next:adjList[node]){
			if(!visit[next]) {
				visit[next] = true;

				dfs(next, cnt + 1);
				
				visit[next] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		adjList = new ArrayList[N];
		visit = new boolean[N];
		
		for(int i=0;i<N;i++)
			adjList[i] = new ArrayList<>();

		while(M-- > 0){
			st = new StringTokenizer(br.readLine(), " ");

			int v = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());

			adjList[v].add(u);
			adjList[u].add(v);
		}

		flag = false;
		for(int i=0;i<N;i++){
			visit[i] = true;

			dfs(i, 1);
			
			visit[i] = false;

			if(flag) {
				System.out.print("1");
				return;
			}
		}
		
		System.out.print("0");
	}
}