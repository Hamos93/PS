package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_4179_불 {
	private static int R, C;
	private static char[][] maze;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static boolean bfs(List<int[]> list){
		Queue<int[]> queue = new LinkedList<>();
		
		for(int i=0;i<list.size();i++){
			int ii = list.get(i)[0];
			int jj = list.get(i)[1];
			
			queue.offer(new int[]{ii, jj, 0});
		}
		
		while(!queue.isEmpty()){
			int[] poll = queue.poll();
			int x = poll[0];
			int y = poll[1];
			int second = poll[2];
			
			for(int d=0;d<4;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(maze[x][y] == 'J'){
					if(0<=nx && nx<R && 0<=ny && ny<C && maze[nx][ny] == '.') {
						maze[nx][ny] = 'J';
						queue.offer(new int[]{nx, ny, second + 1});
					}
					
					// 탈출한 경우
					if(0>nx || nx>=R || 0>ny || ny>=C){
						System.out.print(second + 1);
						return true;
					}
				}else{
					if(0<=nx && nx<R && 0<=ny && ny<C && (maze[nx][ny] == '.' || maze[nx][ny] == 'J')) {
						maze[nx][ny] = 'F';
						queue.offer(new int[]{nx, ny, second + 1});
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		maze = new char[R][C];
		List<int[]> list = new ArrayList<>();
		int r = 0, c = 0;
		
		for(int i=0;i<R;i++){
			String line = br.readLine();
			for(int j=0;j<C;j++){
				maze[i][j] = line.charAt(j);
				
				if(maze[i][j] == 'F') list.add(new int[]{i, j});
				if(maze[i][j] == 'J') {
					r = i;
					c = j;
				}
			}
		}
		
		list.add(0, new int[]{r, c});
		
		if(!bfs(list)) System.out.print("IMPOSSIBLE");
	}
}