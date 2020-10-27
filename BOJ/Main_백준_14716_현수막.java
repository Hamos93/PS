import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14716_현수막 {
	private static int M, N;
	private static int[][] banner;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static final int[] dy = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < M && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int d=0;d<8;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny) && !visit[nx][ny] && banner[nx][ny] == 1) dfs(nx, ny);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		banner = new int[M][N];
		visit = new boolean[M][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				banner[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(!visit[i][j] && banner[i][j] == 1) {
					cnt++;
					
					dfs(i, j);
				}
			}
		}
		
		System.out.print(cnt);
	}
}