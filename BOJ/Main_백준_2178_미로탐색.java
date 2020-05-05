package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2178_미로탐색 {
	private static int N, M;
	private static int[][] map;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static void bfs(int i, int j){
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];

		queue.offer(new int[]{i, j, 1});
		visit[i][j] = true;

		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			int cnt = curr[2];

			if(x == N-1 && y == M-1) {
				System.out.print(cnt);
				return;
			}

			for(int d=0;d<4;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];

				if(0 > nx || nx >= N || 0 > ny || ny >= M || visit[nx][ny] || map[nx][ny] == 0) continue;

				queue.offer(new int[]{nx, ny, cnt + 1});
				visit[nx][ny] = true;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		for(int i=0;i<N;i++){
			String line = br.readLine();
			for(int j=0;j<M;j++)
				map[i][j] = line.charAt(j) - '0';
		}

		bfs(0, 0);
	}
}