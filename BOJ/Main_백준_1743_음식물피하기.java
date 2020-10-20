import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1743_음식물피하기 {
	private static int N, M, size;
	private static char[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void dfs(int x, int y) {
		visit[x][y] = true;
		size++;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(1 <= nx && nx <= N && 1 <= ny && ny <= M && !visit[nx][ny] && map[nx][ny] == '#')
				dfs(nx, ny);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		map = new char[N + 1][M + 1];
		visit = new boolean[N + 1][M + 1];
		
		for(int i=1;i<=N;i++)
			Arrays.fill(map[i], '.');
		
		while(0 < K--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			map[r][c] = '#';
		}
		
		int answer = 0;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=M;j++) {
				if(!visit[i][j] && map[i][j] == '#') {
					size = 0;
				
					dfs(i, j);
			
					answer = answer < size ? size : answer;
				}
			}
		}
		
		System.out.print(answer);
	}
}