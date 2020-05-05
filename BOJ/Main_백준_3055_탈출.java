package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_3055_탈출 {
	private static int R, C;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static boolean bfs(List<int[]> list) {
		Queue<int[]> queue = new LinkedList<>();

		for(int i=0;i<list.size();i++){
			int ii = list.get(i)[0];
			int jj = list.get(i)[1];

			queue.offer(new int[]{ii, jj, 0});
		}

		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			int time = curr[2];

			for(int d=0;d<4;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];

				if(0>nx || nx>=R || 0>ny || ny>=C || map[nx][ny] == 'X') continue;

				// 고슴도치의 이동
				if(map[x][y] == 'S'){
					// 비버의 소굴의 도착
					if(map[nx][ny] == 'D') {
						System.out.print(time + 1);
						return true;
					}

					if(map[nx][ny] == '.'){
						map[nx][ny] = 'S';
						queue.offer(new int[]{nx, ny, time + 1});
					}
				}

				// 물의 이동
				if(map[x][y] == '*') {
					if(map[nx][ny] == '.' || map[nx][ny] == 'S') {
						map[nx][ny] = '*';
						queue.offer(new int[]{nx, ny, time + 1});
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

		map = new char[R][C];
		List<int[]> list = new ArrayList<>();
		int x = 0, y = 0;

		for(int i=0;i<R;i++){
			String line = br.readLine();
			for(int j=0;j<C;j++){
				map[i][j] = line.charAt(j);

				// 물의 위치
				if(map[i][j] == '*') list.add(new int[]{i, j});

				// 고슴도치의 위치
				if(map[i][j] == 'S') {
					x = i;
					y = j;
				}
			}
		}

		// 고슴도치 위치를 가장 처음에 저장
		list.add(0, new int[]{x, y});

		if(!bfs(list)) System.out.print("KAKTUS");
	}
}