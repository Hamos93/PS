import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_13565_침투 {
	private static int M, N;
	private static boolean flag;
	private static int[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < M && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		if(x == M - 1) {
			flag = true;
			return;
		}
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
		
			if(isRange(nx, ny) && !visit[nx][ny] && map[nx][ny] == 0) dfs(nx, ny);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		map = new int[M][N];
		visit = new boolean[M][N];
		
		for(int i=0;i<M;i++) {
			String input = br.readLine();
			for(int j=0;j<N;j++)
				map[i][j] = input.charAt(j) - '0';
		}
		
		for(int i=0;i<N;i++) {
			if(!visit[0][i] && map[0][i] == 0) {
				flag = false;
				
				dfs(0, i);
				
				if(flag) break;
			}
		}
		
		if(flag) System.out.print("YES");
		else System.out.print("NO");
	}
}