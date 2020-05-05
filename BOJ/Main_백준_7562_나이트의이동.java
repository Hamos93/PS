package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_7562_나이트의이동 {
	private static int[][] chessboard;
	private static final int[] dx = { -2, -2, -1, 1, 2, 2, 1, -1 };
	private static final int[] dy = { -1, 1, 2, 2, 1, -1, -2, -2 };
	
	private static int bfs(int i, int j, int r, int c, int N){
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{i, j});
		int result = 0;
		
		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			
			if(x == r && y == c){
				result = chessboard[r][c];
				break;
			}
			
			for(int d=0;d<8;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0>nx || nx>=N || 0>ny || ny>=N || chessboard[nx][ny] != 0) continue;
				
				chessboard[nx][ny] = chessboard[x][y] + 1;
				queue.offer(new int[]{nx, ny});
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++){
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			chessboard = new int[N][N];
			
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int answer = bfs(i, j, r, c, N);
		
			System.out.println(answer);
		}
	}
}