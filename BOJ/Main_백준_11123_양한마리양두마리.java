import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11123_양한마리양두마리 {
	private static int H, W, sheep;
	private static char[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 }; 
	private static final int[] dy = { 0, 0, -1, 1 }; 
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < H && 0 <= y && y < W) return true;
		else return false;
	}
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny) && !visit[nx][ny] && map[nx][ny] == '#') dfs(nx, ny);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
		
			map = new char[H][W];
			visit = new boolean[H][W];
			
			for(int i=0;i<H;i++) {
				String input = br.readLine();
				for(int j=0;j<W;j++)
					map[i][j] = input.charAt(j);
			}

			sheep = 0;
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					if(!visit[i][j] && map[i][j] == '#') {
						sheep++;

						dfs(i, j);
					}
				}
			}
			
			System.out.println(sheep);
		}
	}
}