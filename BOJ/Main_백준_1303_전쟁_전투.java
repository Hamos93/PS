import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1303_전쟁_전투 {
	private static int N, M, friendly, enemy, cnt;
	private static char[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < M && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static void dfs(int x, int y, char id) {
		visit[x][y] = true;
		cnt++;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
		
			if(isRange(nx, ny) && !visit[nx][ny] && map[nx][ny] == id) dfs(nx, ny, id);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[M][N];
		visit = new boolean[M][N];
		
		for(int i=0;i<M;i++) {
			String input = br.readLine();
			for(int j=0;j<N;j++)
				map[i][j] = input.charAt(j);
		}
		
		friendly = enemy = 0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(!visit[i][j]) {
					cnt = 0;
				
					dfs(i, j, map[i][j]);
					
					if(map[i][j] == 'W') friendly += cnt * cnt;
					else enemy += cnt * cnt;
				}
			}
		}
		
		System.out.print(friendly + " " + enemy);
	}
}