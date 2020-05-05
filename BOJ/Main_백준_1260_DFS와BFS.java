package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_1260_DFS와BFS {
	private static int N;
	private static int[][] graph;
	private static boolean[] dVisit;
	
	private static void dfs(int node){
		dVisit[node] = true;
		System.out.print(node + " ");

		for(int next=1;next<N+1;next++){
			if(!dVisit[next] && graph[node][next] == 1) dfs(next);
		}
	}
	
	private static void bfs(int node){
		Queue<Integer> queue = new LinkedList<>();
		boolean[] bVisit = new boolean[N+1];

		queue.offer(node);
		bVisit[node] = true;
		
		while(!queue.isEmpty()){
			int curr = queue.poll();
			System.out.print(curr + " ");
			
			for(int next=1;next<N+1;next++){
				if(!bVisit[next] && graph[curr][next] == 1){
					queue.offer(next);
					bVisit[next] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());
		
		graph = new int[N+1][N+1];
		dVisit = new boolean[N+1];
		
		while(M-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
		
			graph[u][v] = graph[v][u] = 1;
		}
		
		dfs(startNode);
		
		System.out.println();
		
		bfs(startNode);
	}
}