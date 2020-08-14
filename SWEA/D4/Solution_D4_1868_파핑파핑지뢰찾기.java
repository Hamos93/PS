import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1868_파핑파핑지뢰찾기 {
	private static char[][] map;
	private static int N;
	private static final int[] di = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static final int[] dj = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	private static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][N];
		
		queue.offer(new int[] { r, c });
		visit[r][c] = true;
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			int i = curr[0]; int j = curr[1];
			
			for(int d=0;d<8;d++) {
				int ni = i + di[d];
				int nj = j + dj[d];
				
				if(isRange(ni, nj)) {
					display(ni, nj);
					
					if(map[ni][nj] == '0' && !visit[ni][nj]) {
						queue.offer(new int[] { ni, nj });
						visit[ni][nj] = true;
					}
				}
			}
		}
	}

	private static void display(int i, int j) {
		int landMine = 0;
		for(int d=0;d<8;d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(!isRange(ni, nj)) continue;
			if(map[ni][nj] == '*') landMine++;
		}
		
		if(landMine == 0) map[i][j] = '0';
		else map[i][j] = 'V';
	}
	
	private static boolean isRange(int i, int j) {
		if(0 <= i && i < N && 0 <= j && j < N) return true;
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			map = new char[N][N];
		
			for(int i=0;i<N;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<N;j++)
					map[i][j] = line.charAt(j);
			}
			
			int click = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j] == '.') {
						boolean flag = true;
						
						for(int d=0;d<8;d++) {
							int ni = i + di[d];
							int nj = j + dj[d];
							
							if(!isRange(ni, nj)) continue;
							if(map[ni][nj] == '*') {
								flag = false;
								break;
							}
						}
						
						if(flag) {
							map[i][j] = '0';
							click++;
							
							bfs(i, j);
						}
					}
				}
			}
		
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++)
					if(map[i][j] == '.') click++;
			}
			
			System.out.println("#" + tc + " " + click);
		}
	}
}