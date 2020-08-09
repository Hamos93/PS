import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1226_미로1 {
	private static int[][] map;
	private static boolean[][] visit;
	private static int answer;
	private static final int N = 16;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		if(map[x][y] == 3) {
			answer = 1;
			return;
		}
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny) && !visit[nx][ny] && (map[nx][ny] == 0 || map[nx][ny] == 3)) dfs(nx, ny);
		}
	}
	
	private static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			
			int x = 0, y = 0;
			map = new int[N][N];
			for(int i=0;i<N;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<N;j++) {
					map[i][j] = line.charAt(j) - '0';
					
					if(map[i][j] == 2) {
						x = i;
						y = j;
					}
				}
			}
			
			visit = new boolean[N][N];

			answer = 0;
			dfs(x, y);
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}