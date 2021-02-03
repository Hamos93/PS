import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int index;
	int weight;
	
	public Node(int index, int weight) {
		this.index = index;
		this.weight = weight;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Node other) {
		if(this.weight < other.weight) return -1;
		return 1;
	}
}

public class Main_백준_11779_최소비용구하기2 {
	private static final int INF = (int)1e9;
	
	private static int n;
	private static ArrayList<ArrayList<Node>> graph;
	private static int[] distance;
	private static int[] route; // 역추적 배열
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		distance = new int[n + 1];
		route = new int[n + 1];
		
		Arrays.fill(distance, INF);
		
		pq.offer(new Node(start, 0));
		distance[start] = 0;
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			
			int cur = node.getIndex();
			int weight = node.getWeight();
			
			if(distance[cur] < weight) continue;
			
			for(int i=0;i<graph.get(cur).size();i++) {
				int cost = distance[cur] + graph.get(cur).get(i).getWeight();
				
				if(cost < distance[graph.get(cur).get(i).getIndex()]) {
					distance[graph.get(cur).get(i).getIndex()] = cost;
					
					// 최단경로 갱신 시 route[다음노드] = 현재노드
					route[graph.get(cur).get(i).getIndex()] = cur;
					
					pq.offer(new Node(graph.get(cur).get(i).getIndex(), cost));
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList<ArrayList<Node>>();
		for(int i=0;i<=n;i++)
			graph.add(new ArrayList<Node>());
		
		while(0 < m--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(new Node(v, w));
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int src = Integer.parseInt(st.nextToken());
		int dest = Integer.parseInt(st.nextToken());

		dijkstra(src);
	
		int cost = distance[dest];
		System.out.println(cost);
		
		Stack<Integer> stack = new Stack<>();
		while(true) {
			stack.push(dest);
			
			dest = route[dest];
			if(dest == src) {
				stack.push(dest);
				break;
			}
		}
		
		System.out.println(stack.size());
		while(!stack.isEmpty()) System.out.print(stack.pop() + " ");
	}
}