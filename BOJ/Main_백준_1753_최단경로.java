import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int index;
	int distance;
	
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getDistance() {
		return this.distance;
	}

	@Override
	public int compareTo(Node other) {
		if(this.distance < other.distance) return -1;
		return 1;
	}
}

public class Main_백준_1753_최단경로 {
	private static final int INF = (int)1e9;
	private static int V, E;
	private static ArrayList<ArrayList<Node>> graph;
	private static int[] distance;
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();

		pq.offer(new Node(start, 0));
		distance[start] = 0;
	
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			int cur = node.getIndex();
			int dist = node.getDistance();
			
			if(distance[cur] < dist) continue;
			
			for(int i=0;i<graph.get(cur).size();i++) {
				int cost = distance[cur] + graph.get(cur).get(i).getDistance();
				
				if(cost < distance[graph.get(cur).get(i).getIndex()]) {
					distance[graph.get(cur).get(i).getIndex()] = cost;
					pq.offer(new Node(graph.get(cur).get(i).getIndex(), cost));
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Node>>();
		distance = new int[20001];

		for(int i=0;i<=V;i++)
			graph.add(new ArrayList<Node>());
		
		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<E;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
		
			graph.get(u).add(new Node(v, w));
		}
		
		Arrays.fill(distance, INF);
		
		dijkstra(K);
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=V;i++) {
			if(distance[i] == INF) sb.append("INF\n");
			else sb.append(distance[i] + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}