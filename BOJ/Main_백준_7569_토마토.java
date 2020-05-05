package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_7569_토마토 {
	private static int N, M, H;
	private static int[][][] box;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void bfs(List<int[]> tomato){
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0;i<tomato.size();i++)
			queue.offer(tomato.get(i));
		
		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			int h = curr[0];
			int x = curr[1];
			int y = curr[2];
			
			if(0 <= h-1 && box[h-1][x][y] == 0){
				box[h-1][x][y] = box[h][x][y] + 1;
				queue.offer(new int[]{h-1, x, y});
			}
			
			if(h+1 < H && box[h+1][x][y] == 0){
				box[h+1][x][y] = box[h][x][y] + 1;
				queue.offer(new int[]{h+1, x, y});
			}
			
			for(int d=0;d<4;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0>nx || nx>=N || 0>ny || ny>=M || box[h][nx][ny] != 0) continue;
				
				box[h][nx][ny] = box[h][x][y] + 1;
				queue.offer(new int[]{h, nx, ny});
 			}
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
	
		box = new int[H][N][M];
		List<int[]> tomato = new ArrayList<>();
		int cnt = 0;
		
		for(int h=0;h<H;h++){
			for(int i=0;i<N;i++){
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<M;j++){
					box[h][i][j] = Integer.parseInt(st.nextToken());
					
					if(box[h][i][j] == 0) cnt++;
					if(box[h][i][j] == 1) tomato.add(new int[]{h, i, j});
				}
			}
		}
		
		if(cnt == 0) {
			System.out.print("0");
			return;
		}
	
		bfs(tomato);
		int answer = 0;
		for(int h=0;h<H;h++){
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					if(box[h][i][j] == 0) {
						System.out.print("-1");
						return; 
					}
					
					answer = answer < box[h][i][j] ? box[h][i][j] : answer;
				}
			}
		}
		
		System.out.print(answer - 1);
		
	}
}