import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2468_안전영역 {
	private static int N;
	private static int[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static void rain(int k) {
		for(int i=0;i<N;i++) 
			for(int j=0;j<N;j++) 
				if(map[i][j] <= k) map[i][j] = 0;
	}

	private static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
		
			if(0>nx || nx>=N || 0>ny || ny>=N || visit[nx][ny] || map[nx][ny] == 0) continue;
			
			dfs(nx, ny);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];

		int height = 0;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				height = height < map[i][j] ? map[i][j] : height; 
			}
		}
		
		int answer = 0;
		for(int k=0;k<=height;k++) {
			rain(k);
			visit = new boolean[N][N];
			int cnt = 0;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(!visit[i][j] && map[i][j] != 0) {
						cnt++;
						dfs(i, j);
						
						answer = answer < cnt ? cnt : answer;
					}
				}
			}
		}
		
		System.out.print(answer);
	}
}