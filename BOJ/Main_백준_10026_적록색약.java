package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_10026_적록색약 {
	private static int N;
	private static char[][] map;
	private static boolean[][] visit;
	private static boolean[][] rgVisit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void dfs(int x, int y, char color){
		visit[x][y] = true;
		
		for(int d=0;d<4;d++){
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0>nx || nx>=N || 0>ny || ny>=N || visit[nx][ny] || map[nx][ny] != color) continue;
			
			dfs(nx, ny, color);
		}
	}
	
	private static void rgDfs(int x, int y, char color){
		rgVisit[x][y] = true;
		
		for(int d=0;d<4;d++){
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0>nx || nx>=N || 0>ny || ny>=N || rgVisit[nx][ny]) continue;
			
			if(color == 'B' && map[nx][ny] == 'B') rgDfs(nx, ny, color);
			if((color == 'R' || color == 'G') && (map[nx][ny] == 'R' || map[nx][ny] == 'G')) rgDfs(nx, ny, color);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		map = new char[N][N];
		
		for(int i=0;i<N;i++){
			String line = br.readLine();
			for(int j=0;j<N;j++)
				map[i][j] = line.charAt(j);
		}
		
		// 1. 적록색약 X
		visit = new boolean[N][N];
		int cnt1 = 0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!visit[i][j]){
					cnt1++;
					
					dfs(i, j, map[i][j]);
				}
			}
		}
		
		// 2. 적록색약 O
		rgVisit = new boolean[N][N];
		int cnt2 = 0;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!rgVisit[i][j]){
					cnt2++;
					
					rgDfs(i, j, map[i][j]);
				}
			}
		}
		
		System.out.print(cnt1 + "\n" + cnt2);
	}
}