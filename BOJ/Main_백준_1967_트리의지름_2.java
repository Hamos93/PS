import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Node {
	int node;
	int weight;

	public Node(int node, int weight) {
		this.node = node;
		this.weight = weight;
	}
}

public class Main_백준_1967_트리의지름_2 {
	private static int n, diameter, diameterNode;
	private static List<Node>[] graph;
	private static int[] dist;

	public static void dfs(int node, int len) {
		dist[node] = len;

		if(diameter < dist[node]) {
			diameter = dist[node];
			diameterNode = node;
		}

		for(Node next : graph[node]) {
			int nextNode = next.node;
			int weight = next.weight;

			if(dist[nextNode] == 0) dfs(nextNode, len + weight);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		
		if(n == 1) {
			System.out.print(0);
			return;
		}
		
		graph = new ArrayList[10001];

		for(int i=1;i<=10000;i++)
			graph[i] = new ArrayList<>();

		while(1 < n--) {
			st = new StringTokenizer(br.readLine(), " ");

			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			graph[parent].add(new Node(child, weight));
			graph[child].add(new Node(parent, weight));
		}

		diameter = 0;
		dist = new int[10001];

		dfs(1, 0);

		diameter = 0;
		dist = new int[10001];

		dfs(diameterNode, 0);
		System.out.print(diameter);
	}
}