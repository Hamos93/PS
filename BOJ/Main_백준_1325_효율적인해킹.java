import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_1325_효율적인해킹 {
	private static int N, computer;
	private static List<Integer>[] graph;
	private static boolean[] visit;
	
	private static void dfs(int node) {
		visit[node] = true;
		computer++;
		
		for(int next : graph[node])
			if(!visit[next]) dfs(next);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N + 1];
		for(int i=1;i<=N;i++)
			graph[i] = new ArrayList<>();
		
		
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			graph[B].add(A);
		}
		
		int[] cnt = new int[N+1];
		for(int i=1;i<=N;i++) {
			visit = new boolean[N+1];
			computer = 0;

			dfs(i);
			
			cnt[i] = computer;
		}
		
		int max = 0;
		for(int i=1;i<=N;i++)
			if(max < cnt[i]) max = cnt[i];
	
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=N;i++)
			if(max == cnt[i]) sb.append(i + " ");
		
		System.out.print(sb.toString().trim());
	}
}