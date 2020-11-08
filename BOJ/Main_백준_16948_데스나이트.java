import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_16948_데스나이트 {
	private static final int[] dx = { -2, -2, 0, 0, 2, 2 };
	private static final int[] dy = { -1, 1, -2, 2, -1, 1 };
	
	public static void bfs(int x1, int y1, int x2, int y2, int N) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][N];
	
		queue.offer(new int[] { x1, y1, 0 });
		visit[x1][y1] = true;
	
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			
			if(x == x2 && y == y2) {
				System.out.print(cnt);
				return;
			}
			
			for(int d=0;d<6;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < N && 0 <= ny && ny < N && !visit[nx][ny]) {
					queue.offer(new int[] { nx, ny, cnt + 1 });
					visit[nx][ny] = true;
				}
			}
		}
		
		System.out.print("-1");
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int r1 = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());

		bfs(r1, c1, r2, c2, N);
	}
}