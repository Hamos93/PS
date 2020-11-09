import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_6593_상범빌딩 {
	private static int L, R, C, minute;
	private static boolean flag;
	private static char[][][] building;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	public static void bfs(int f1, int x1, int y1, int f2, int x2, int y2) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][][] visit = new boolean[L][R][C];
		
		queue.offer(new int[] { f1, x1, y1, 0 });
		visit[f1][x1][y1] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int f = poll[0], x = poll[1], y = poll[2], cnt = poll[3];
			
			if(f == f2 && x == x2 && y == y2) {
				flag = true;
				minute = cnt;
				
				return;
			}
			
			if(0 <= f-1 && !visit[f-1][x][y] && building[f-1][x][y] != '#') {
				queue.offer(new int[] { f-1, x, y, cnt + 1 });
				visit[f-1][x][y] = true;
			}
			
			if(f+1 < L && !visit[f+1][x][y] && building[f+1][x][y] != '#') {
				queue.offer(new int[] { f+1, x, y, cnt + 1 });
				visit[f+1][x][y] = true;
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < R && 0 <= ny && ny < C && !visit[f][nx][ny] && building[f][nx][ny] != '#') {
					queue.offer(new int[] { f, nx, ny, cnt + 1 });
					visit[f][nx][ny] = true;
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());

			if(L == 0 && R == 0 && C == 0) return;

			building = new char[L][R][C];
			int startF = 0, startX = 0, startY = 0;  
			int endF = 0, endX = 0, endY = 0;  
			for(int k=0;k<L;k++) {
				for(int i=0;i<R;i++) {
					String input = br.readLine();
					for(int j=0;j<C;j++) {
						building[k][i][j] = input.charAt(j);

						if(building[k][i][j] == 'S') {
							startF = k;
							startX = i;
							startY = j;
						}
						
						if(building[k][i][j] == 'E') {
							endF = k;
							endX = i;
							endY = j;
						}
					}
				}
				
				br.readLine();
			}
			
			minute = 0; flag = false;
			bfs(startF, startX, startY, endF, endX, endY);
			
			if(flag) System.out.println("Escaped in " + minute + " minute(s).");
			else System.out.println("Trapped!");
		}
	}
}