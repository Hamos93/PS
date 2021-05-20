import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_21736_헌내기는친구가필요해 {
	private static int N, M;
	private static char[][] campus;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < M) return true;
		else return false;
	}
	
	public static int bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];
		
		queue.offer(new int[] { r, c });
		visit[r][c] = true;
		
		int cnt = 0;
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(isRange(nx, ny) && !visit[nx][ny] && campus[nx][ny] != 'X') {
					queue.offer(new int[] { nx, ny });
					visit[nx][ny] = true;
					
					if(campus[nx][ny] == 'P') cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		campus = new char[N][M];
		
		int r = 0, c = 0;
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++) {
				campus[i][j] = input.charAt(j);
				
				if(campus[i][j] == 'I') {
					r = i;
					c = j;
				}
			}
		}
		
		int result = bfs(r, c);
		
		if(result == 0) System.out.print("TT");
		else System.out.print(result);
	}
}