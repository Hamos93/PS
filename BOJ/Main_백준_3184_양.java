import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_3184_양 {
	private static int R, C, sheep, wolf;
	private static char[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		int sheepCount = 0, wolfCount = 0;

		queue.offer(new int[] { i, j });
		visit[i][j] = true;
		
		if(map[i][j] == 'o') sheepCount++;
		if(map[i][j] == 'v') wolfCount++;
	
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(nx < 0 || R <= nx || ny < 0 || C <= ny || visit[nx][ny] || map[nx][ny] == '#') continue;

				queue.offer(new int[] { nx, ny });
				visit[nx][ny] = true;
				
				if(map[nx][ny] == 'o') sheepCount++;
				if(map[nx][ny] == 'v') wolfCount++;
			}
		}
		
		if(wolfCount < sheepCount) sheep += sheepCount;
		else wolf += wolfCount;
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
		
		sheep = wolf = 0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++)
				if(!visit[i][j] && map[i][j] != '#') bfs(i, j);
		}
		
		System.out.print(sheep + " " + wolf);
	}
}