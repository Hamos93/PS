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
		if(this.distance < other.distance) return -1;
		return 1;
	}
}

public class Main_백준_18352_특정거리의도시찾기 {
	private static final int INF = (int) 1e9;
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
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Node>>();
		distance = new int[N + 1];
		
		for(int i=0;i<=N;i++)
			graph.add(new ArrayList<Node>());
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			graph.get(A).add(new Node(B, 1));
		}
		
		Arrays.fill(distance, INF);
		
		dijkstra(X);
		
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		for(int i=1;i<=N;i++) {
			if(distance[i] == K) {
				cnt++;
				sb.append(i + "\n");
			}
		}
		
		if(cnt == 0) System.out.print("-1");
		else System.out.print(sb.toString().trim());
	}
}