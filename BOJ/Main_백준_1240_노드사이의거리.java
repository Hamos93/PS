import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Node {
	int idx;
	int distance;
	
	public Node(int idx, int distance) {
		this.idx = idx;
		this.distance = distance;
	}
}

public class Main_백준_1240_노드사이의거리 {
	private static ArrayList<Node>[] adjList;
	private static boolean[] visit;
	private static int result;
	
	public static void dfs(int src, int dest, int len) {
		if(src == dest) {
			result = Math.min(result, len);
			
			return;
		}
		
		for(Node next : adjList[src]) {
			if(!visit[next.idx]) {
				visit[next.idx] = true;
				
				dfs(next.idx, dest, len + next.distance);
				
				visit[next.idx] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[N + 1];
		visit = new boolean[N + 1];

		for(int i=1;i<=N;i++)
			adjList[i] = new ArrayList<>();
		
		for(int i=1;i<=N-1;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
		
			adjList[u].add(new Node(v, d));
			adjList[v].add(new Node(u, d));
		}
		
		StringBuilder sb = new StringBuilder();
		while(0 < M--) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			visit[u] = true;
			
			result = (int)1e8;
			dfs(u, v, 0);
		
			visit[u] = false;
			
			sb.append(result + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}