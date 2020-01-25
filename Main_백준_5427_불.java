package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_5427_불 {
	private static int w, h;
	private static char[][] building;
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
			
				// 상근이
				if(building[x][y] == '@'){
					// 탈출에 성공했을 경우
					if(0>nx || nx>=h || 0>ny || ny>=w){
						System.out.println(second + 1);
						return true;
					}
					
					if(0<=nx && nx<h && 0<=ny && ny<w && building[nx][ny] == '.') {
						building[nx][ny] = '@';
						queue.offer(new int[]{nx, ny, second + 1});
					}
				}
				
				// 불
				if(building[x][y] == '*'){
					if(0<=nx && nx<h && 0<=ny && ny<w && (building[nx][ny] == '.' || building[nx][ny] == '@')) {
						building[nx][ny] = '*';
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
		
		int T = Integer.parseInt(st.nextToken());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			building = new char[h][w];
			List<int[]> list = new ArrayList<>();
			int r = 0, c = 0;
			
			for(int i=0;i<h;i++){
				String line = br.readLine();
				for(int j=0;j<w;j++){
					building[i][j] = line.charAt(j);
					
					// 불의 위치 리스트에 저장
					if(building[i][j] == '*') list.add(new int[]{i, j});
					// 상근이의 위치
					if(building[i][j] == '@') {
						r = i;
						c = j;
					}
				}
			}
			
			// 상근이의 위치 리스트 0번 인덱스에 저장
			list.add(0, new int[]{r, c});
		
			if(!bfs(list)) System.out.println("IMPOSSIBLE");
		}
	}
}