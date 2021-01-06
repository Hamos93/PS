import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_백준_1261_알고스팟 {
	private static final int INF = (int) 1e9;
	private static int N, M;
	private static int[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static int dijkstra(int r, int c) {
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o2[2] < o1[2]) return 1;
				return -1;
			}
		});
		
		int[][] distance = new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)
				distance[i][j] = INF;
		}
		
		pq.offer(new int[] {r, c, 0});
		distance[r][c] = 0;
		
		while(!pq.isEmpty()) {
			int[] poll = pq.poll();
			int x = poll[0], y = poll[1], dist = poll[2];
			
			if(distance[x][y] < dist) continue;
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < M && map[x][y] + dist < distance[nx][ny]) {
					distance[nx][ny] = map[nx][ny] + dist;
					pq.offer(new int[] { nx, ny, distance[nx][ny] });
				}
			}
		}
		
		return distance[N-1][M-1];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				map[i][j] = input.charAt(j) - '0';
		}
		
		int result = dijkstra(0, 0);
		System.out.print(result);
	}
}