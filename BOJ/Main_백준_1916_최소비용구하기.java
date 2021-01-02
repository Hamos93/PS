import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
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
		if(this.getDistance() < other.getDistance()) return -1;
		return 1;
	}
}

public class Main_백준_1916_최소비용구하기 {
	private static final int INF = (int)1e9;
	private static ArrayList<ArrayList<Node>> graph;
	private static int[] distance;
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		
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
		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Node>>();
		for(int i=0;i<=N;i++)
			graph.add(new ArrayList<Node>());
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(new Node(v, w));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		distance = new int[N + 1];
		Arrays.fill(distance, INF);
		
		dijkstra(start);

		System.out.print(distance[end]);
	}
}