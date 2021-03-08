import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_17086_아기상어2 {
	private static int N, M;
	private static int[][] map;
	private static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static int[] dy = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	public static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];
		int result = 0;
		
		queue.offer(new int[] { i, j, 0 });
		visit[i][j] = true;
		
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], z = poll[2];
			
			if(map[x][y] == 1) {
				result = z;
				break;
			}
			
			for(int d=0;d<8;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
			
				if(0 <= nx && nx < N && 0 <= ny && ny < M && !visit[nx][ny]) {
					queue.offer(new int[] { nx, ny, z + 1 });
					visit[nx][ny] = true;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int distance = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 0) {
					int result = bfs(i, j);
					
					distance = distance < result ? result : distance;
				}
			}
		}
		
		System.out.print(distance);
	}
}