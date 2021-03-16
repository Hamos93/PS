import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1520_내리막길 {
	private static int M, N;
	private static int[][] map;
	private static int[][] dp;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	public static boolean isRange(int x, int y) {
		if(0 <= x && x < M && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static int dfs(int x, int y) {
		if(x == M-1 && y == N-1) return 1;
		
		if(dp[x][y] == -1) {
			dp[x][y] = 0;
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(isRange(nx, ny) && map[nx][ny] < map[x][y])
					dp[x][y] += dfs(nx, ny);
			}
		}
		
		return dp[x][y];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
	
		map = new int[M][N];
		dp = new int[M][N];
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		System.out.print(dfs(0, 0));
	}
}