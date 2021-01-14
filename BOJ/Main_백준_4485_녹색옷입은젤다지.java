import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_4485_녹색옷입은젤다지 {
	private static final int INF = (int)(1e8);
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static int N;
	private static int[][] map;
	private static int[][] distance;
	
	public static int dijkstra(int r, int c) {
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[2] < o2[2]) return -1;
				return 1;
			}
		});
		
		distance = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				distance[i][j] = INF;
		}
		
		pq.offer(new int[] { r, c, map[r][c] });
		distance[r][c] = map[r][c];

		while(!pq.isEmpty()) {
			int[] poll = pq.poll();
			int x = poll[0], y = poll[1], cost = poll[2];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(nx < 0 || N <= nx || ny < 0 || N <= ny) continue;
				if(map[nx][ny] + cost < distance[nx][ny]) {
					pq.offer(new int[] { nx, ny, map[nx][ny] + cost });
					distance[nx][ny] = map[nx][ny] + cost;
				}
			}
		}
		
		return distance[N-1][N-1];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int T = 1;
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			
			if(N == 0) return;
			
			map = new int[N][N];
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int result = dijkstra(0, 0);
			System.out.println("Problem " + (T++) + ": " + result);
		}
	}
}