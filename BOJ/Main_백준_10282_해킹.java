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

public class Main_백준_10282_해킹 {
	private static final int INF = (int) 1e9;
	private static ArrayList<ArrayList<Node>> graph;
	private static int[] distance;
	
	public static void dijkstra(int start, int n) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		
		distance = new int[n + 1];
		Arrays.fill(distance, INF);
		
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
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
		
			graph = new ArrayList<ArrayList<Node>>();
			for(int i=0;i<=n;i++)
				graph.add(new ArrayList<Node>());
		
			for(int i=0;i<d;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
			
				graph.get(b).add(new Node(a, s));
			}
			
			dijkstra(c, n);
	
			int cnt = 0, time = 0;
			for(int i=1;i<=n;i++) {
				if(distance[i] == INF) continue;
				else {
					cnt++;
					time = Math.max(time, distance[i]);
				}
			}
			
			sb.append(cnt + " " + time + "\n");
		}
		
		System.out.print(sb.toString().trim());
	}
}