import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_2665_미로만들기 {
	private static final int INF = (int) 1e8;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static int n;
	private static int[][] maze;

	public static int dijkstra(int r, int c) {
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2] < o2[2]) return -1;
				return 1;
			}
		});
		
		int[][] distance = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				distance[i][j] = INF;
		}
		
		pq.offer(new int[] { r, c, 0 });
		distance[0][0] = 0;
		
		while(!pq.isEmpty()) {
			int[] poll = pq.poll();
			int x = poll[0], y = poll[1], cost = poll[2];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < n && 0 <= ny && ny < n && (maze[nx][ny] + cost < distance[nx][ny])) {
					pq.offer(new int[] { nx, ny, maze[nx][ny] + cost });
					distance[nx][ny] = maze[nx][ny] + cost;
				}
			}
		}
		
		return distance[n-1][n-1];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		maze = new int[n][n];
		
		for(int i=0;i<n;i++) {
			String input = br.readLine();
			for(int j=0;j<n;j++) {
				int value = input.charAt(j) - '0';
			
				if(value == 1) value = 0;
				else value = 1;
				
				maze[i][j] = value;
			}
		}
		
		int result = dijkstra(0, 0);
		System.out.print(result);
	}
}