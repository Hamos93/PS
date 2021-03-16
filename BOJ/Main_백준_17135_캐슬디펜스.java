import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_17135_캐슬디펜스 {
	private static int N, M, D;
	private static int[][] map;
	private static int[][] simulate;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static void copy() {
		simulate = new int[N+1][M];
		
		for(int i=0;i<N+1;i++) {
			for(int j=0;j<M;j++)
				simulate[i][j] = map[i][j];
		}
	}
	
	public static boolean search() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)
				if(simulate[i][j] == 1) return true;
		}
		
		return false;
	}
	
	public static boolean attack(int x, int y) {
		if(x == Integer.MAX_VALUE && y == Integer.MAX_VALUE || simulate[x][y] == 0) return false;
		else return true;
	}
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N + 1 && 0 <= y && y < M) return true;
		else return false;
	}
	
	public static void move() {
		for(int i=N-1;0<=i;i--) {
			for(int j=0;j<M;j++) {
				if(i == 0) simulate[i][j] = 0;
				else simulate[i][j] = simulate[i-1][j];
			}
		}
	}
	
	public static int[] bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N+1][M];
		
		int destX = Integer.MAX_VALUE, destY = Integer.MAX_VALUE, distance = D;
		
		queue.offer(new int[] { r, c, 0 });
		visit[r][c] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			
			if(simulate[x][y] == 1) {
				if(cnt < distance) {
					destX = x;
					destY = y;
					distance = cnt;
				}else if(cnt == distance) {
					if(y < destY) {
						destX = x;
						destY = y;
						distance = cnt;
					}
				}
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(isRange(nx, ny) && !visit[nx][ny] && simulate[nx][ny] != 2) {
					queue.offer(new int[] { nx, ny, cnt + 1 });
					visit[nx][ny] = true;
				}
			}
		}
		
		return new int[] { destX, destY };
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		
		map = new int[N+1][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		for(int k1=0;k1<M;k1++) {
			map[N][k1] = 2;
			for(int k2=0;k2<M;k2++) {
				if(k1 == k2) continue;
				map[N][k2] = 2;
				for(int k3=0;k3<M;k3++) {
					if(k1 == k3 || k2 == k3) continue;
	
					map[N][k3] = 2;
					
					copy();
				
					int enemy = 0;
					while(true) {
						if(!search()) break;
					
						int[] pos1 = bfs(N, k1);
						int[] pos2 = bfs(N, k2);
						int[] pos3 = bfs(N, k3);
					
						if(attack(pos1[0], pos1[1])) {
							simulate[pos1[0]][pos1[1]] = 0;
							enemy++;
						}
						
						if(attack(pos2[0], pos2[1])) {
							simulate[pos2[0]][pos2[1]] = 0;
							enemy++;
						}
						
						if(attack(pos3[0], pos3[1])) {
							simulate[pos3[0]][pos3[1]] = 0;
							enemy++;
						}
					
						move();
					}
					
					answer = answer < enemy ? enemy : answer;
	
					map[N][k3] = 0;
				}
				
				map[N][k2] = 0;
			}
			
			map[N][k1] = 0;
		}
		
		System.out.print(answer);
	}
}