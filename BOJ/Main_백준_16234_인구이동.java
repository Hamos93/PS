import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_16234_인구이동 {
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static int N, L, R, sum; 
	private static int[][] map;
	private static boolean[][] visit;
	private static List<int[]> list;
	
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0 > nx || nx >= N || 0 > ny || ny >= N || visit[nx][ny]) continue;
			
			if(L <= Math.abs(map[x][y] - map[nx][ny]) && Math.abs(map[x][y] - map[nx][ny]) <= R) {
				list.add(new int[] { nx, ny });
				sum += map[nx][ny];
				
				dfs(nx, ny);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
	
		map = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
	
		int answer = 0;
		while(true) {
			boolean flag = false;
			
			list = new ArrayList<>();
			sum = 0;
			
			visit = new boolean[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(!visit[i][j]) {
						list.add(new int[] { i, j });
						sum = map[i][j];
					
						dfs(i, j);
						
						if(list.size() == 1) list.clear();
						else {
							flag = true;
							
							int avg = sum / list.size();
							for(int k=0;k<list.size();k++)
								map[list.get(k)[0]][list.get(k)[1]] = avg;
							
							list.clear();
						}
					}
				}
			}
			
			if(flag) answer++;
			else break;
		}
		
		System.out.print(answer);
	}
}