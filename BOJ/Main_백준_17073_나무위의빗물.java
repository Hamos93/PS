import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_백준_17073_나무위의빗물 {
	private static int N, cnt;
	private static ArrayList<Integer>[] adjList;
	private static boolean[] visit;
	
	public static void dfs(int x) {
		visit[x] = true;
		
		boolean flag = true;
		for(int next:adjList[x]) {
			if(!visit[next]) {
				flag = false;
				dfs(next);
			}
		}
		
		if(flag) cnt++;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			adjList[i] = new ArrayList<>();
		
		for(int i=1;i<=N-1;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			adjList[u].add(v); adjList[v].add(u);
		}

		cnt = 0;

		visit = new boolean[N + 1];
		dfs(1);
		
		double P = (double)(W) / cnt;
		System.out.print(String.format("%.10f", P));
	}
}