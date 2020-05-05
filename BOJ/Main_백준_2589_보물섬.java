import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2589_보물섬 {
	private static int N, M;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static int bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];
		int time = 0;
		
		queue.offer(new int[] {i, j, 0});
		visit[i][j] = true;
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			int cnt = curr[2];
			
			if(time < cnt) time = cnt;
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0<=nx && nx<N && 0<=ny && ny<M && !visit[nx][ny] && map[nx][ny] == 'L') {
					queue.offer(new int[] {nx, ny, cnt + 1});
					visit[nx][ny] = true;
				}
			}
		}
		
		return time;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		for(int i=0;i<N;i++) {
			String line = br.readLine();
			for(int j=0;j<M;j++)
				map[i][j] = line.charAt(j);
		}
		
		int answer = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(map[i][j] == 'L') {
					int result = bfs(i, j);
					
					answer = answer < result ? result : answer;
				}
			}
		}
		
		System.out.print(answer);
	}
}