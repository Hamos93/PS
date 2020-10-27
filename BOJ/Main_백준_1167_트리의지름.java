import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Node {
	int vertex;
	int weight;
	
	public Node(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}
}

public class Main_백준_1167_트리의지름 {
	private static int V, diameter, diameterNode;
	private static List<Node>[] graph;
	private static boolean[] visit;

	public static void dfs(int node, int len) {
		visit[node] = true;
		
		if(diameter < len) {
			diameter = len;
			diameterNode = node;
		}
		
		for(Node next : graph[node])
			if(!visit[next.vertex])
				dfs(next.vertex, len + next.weight);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		graph = new ArrayList[V + 1];
		
		for(int i=1;i<=V;i++)
			graph[i] = new ArrayList<>();
		
		for(int i=1;i<=V;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int parent = Integer.parseInt(st.nextToken());
			while(st.hasMoreTokens()) {
				int child = Integer.parseInt(st.nextToken()); 
				
				if(child == -1) 
					break;
				
				int weight = Integer.parseInt(st.nextToken()); 
			
				graph[parent].add(new Node(child, weight));
			}
		}
		
		diameter = diameterNode = 0;
		visit = new boolean[V + 1];
		
		dfs(1, 0);

		diameter = 0;
		visit = new boolean[V + 1];
		
		dfs(diameterNode, 0);
		
		System.out.print(diameter);
	}
}