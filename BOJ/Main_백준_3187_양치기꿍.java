import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_3187_양치기꿍 {
	private static int R, C, SHEEP, WOLF;
	private static char[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		int sheep = 0, wolf = 0;
		
		queue.offer(new int[] { x, y });
		visit[x][y] = true;
		
		if(map[x][y] == 'k') sheep++;
		if(map[x][y] == 'v') wolf++;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int curX = poll[0], curY = poll[1];
			
			for(int d=0;d<4;d++) {
				int nx = curX + dx[d];
				int ny = curY + dy[d];
			
				if(nx < 0 || R <= nx || ny < 0 || C <= ny || visit[nx][ny] || map[nx][ny] == '#') continue;
				
				queue.offer(new int[] { nx, ny });
				visit[nx][ny] = true;
				
				if(map[nx][ny] == 'k') sheep++;
				if(map[nx][ny] == 'v') wolf++;
			}
		}
	
		if(wolf < sheep) SHEEP += sheep;
		else WOLF += wolf;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		visit = new boolean[R][C];

		for(int i=0;i<R;i++) {
			String input = br.readLine();
			for(int j=0;j<C;j++)
				map[i][j] = input.charAt(j);
		}
		
		SHEEP = WOLF = 0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++)
				if(!visit[i][j] && map[i][j] != '#') 
					bfs(i, j);
		}

		System.out.print(SHEEP + " " + WOLF);
	}
}