import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_16236_아기상어 {
	private static int N;
	private static int[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static int bfs(int srcX, int srcY, int destX, int destY, int size) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][N];
		int result = Integer.MAX_VALUE;
		
		queue.offer(new int[] { srcX, srcY, 0 });
		visit[srcX][srcY] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			
			if(x == destX && y == destY) {
				result = cnt;
				break;
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(isRange(nx, ny) && !visit[nx][ny] && map[nx][ny] <= size) {
					queue.offer(new int[] { nx, ny, cnt + 1 });
					visit[nx][ny] = true;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		
		int sharkX = 0, sharkY = 0, sharkSize = 2;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				
				if(map[i][j] == 9) {
					sharkX = i;
					sharkY = j;
				}
			}
		}
		
		int time = 0, fish = 0;
		while(true) {
			int fishX = Integer.MAX_VALUE, fishY = Integer.MAX_VALUE, distance = Integer.MAX_VALUE;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j] != 0 && map[i][j] < sharkSize) {
						int result = bfs(sharkX, sharkY, i, j, sharkSize); 
					
						if(result == Integer.MAX_VALUE) 
							continue; 
						
						if(result < distance) {
							fishX = i;
							fishY = j;
							distance = result;
						}else if(result == distance) {
							if(i < fishX) {
								fishX = i;
								fishY = j;
								distance = result;
							}else if(i == fishX && j < fishY) {
								fishX = i;
								fishY = j;
								distance = result;
							}
						}
					}
				}
			}
			
			if(fishX == Integer.MAX_VALUE && fishY == Integer.MAX_VALUE) break;
			
			time += distance;
			fish++;
			
			if(fish == sharkSize) {
				sharkSize++;
				fish = 0;
			}
			
			map[fishX][fishY] = 9;
			map[sharkX][sharkY] = 0;
			
			sharkX = fishX;
			sharkY = fishY;
		}
		
		System.out.print(time);
	}
}