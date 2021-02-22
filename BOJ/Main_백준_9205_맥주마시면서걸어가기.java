import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	int x;
	int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main_백준_9205_맥주마시면서걸어가기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int t = Integer.parseInt(st.nextToken());
		while(0 < t--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			
			List<Node> list = new ArrayList<>();
			for(int i=0;i<n+2;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				list.add(new Node(x, y));
			}
			
			int destX = list.get(n+1).x, destY = list.get(n+1).y;

			Queue<Node> queue = new LinkedList<>();
			boolean[] visit = new boolean[n + 2];
			
			queue.offer(list.get(0));
			visit[0] = true;
			
			boolean flag = false;
			while(!queue.isEmpty()) {
				Node cur = queue.poll();
				int x = cur.x;
				int y = cur.y;
				
				if(x == destX && y == destY) {
					flag = true;
					break;
				}
				
				for(int i=1;i<n+2;i++) {
					if(!visit[i]) {
						int distance = Math.abs(list.get(i).x - x) + Math.abs(list.get(i).y - y);
						
						if(distance <= 1000) {
							queue.offer(new Node(list.get(i).x, list.get(i).y));
							visit[i] = true;
						}
					}
				}
			}
			
			if(flag) System.out.println("happy");
			else System.out.println("sad");
		}
	}
}