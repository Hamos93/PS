import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14503_로봇청소기 {
	// 북 동 남 서
	private static int[] dx = { -1, 0, 1, 0 };
	private static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken()); 
		int c = Integer.parseInt(st.nextToken()); 
		int dir = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		loop: while(true) {
			// 1. 현재위치 청소
			if(map[r][c] == 0) {
				map[r][c] = 2;
				cnt++;
			}

			// 2. 왼쪽방향 탐색
			for(int d=0;d<4;d++) {
				// 왼쪽방향 회전
				dir--;
				if(dir < 0) dir = 3;

				int nr = r + dx[dir];
				int nc = c + dy[dir];

				if(0 <= nr && nr < N && 0 <= nc && nc < M) {
					// 청소할 곳이 존재하면
					if(map[nr][nc] == 0) {
						r = nr; c = nc;

						continue loop;
					}
				}
			}

			// 한 칸 후진
			boolean flag = false;
			int nr = 0, nc = 0;
			switch (dir) {
			case 0:
				nr = r + dx[2];
				nc = c + dy[2];

				if(0 <= nr && nr < N && 0 <= nc && nc < M && map[nr][nc] != 1) {
					r = nr; c = nc;
					flag = true;
				}

				break;
			case 1:
				nr = r + dx[3];
				nc = c + dy[3];

				if(0 <= nr && nr < N && 0 <= nc && nc < M && map[nr][nc] != 1) {
					r = nr; c = nc;
					flag = true;
				}

				break;
			case 2:
				nr = r + dx[0];
				nc = c + dy[0];

				if(0 <= nr && nr < N && 0 <= nc && nc < M && map[nr][nc] != 1) {
					r = nr; c = nc;
					flag = true;
				}

				break;
			case 3:
				nr = r + dx[1];
				nc = c + dy[1];

				if(0 <= nr && nr < N && 0 <= nc && nc < M && map[nr][nc] != 1) {
					r = nr; c = nc;
					flag = true;
				}

				break;
			}

			if(!flag) break;
		}

		System.out.print(cnt);
	}
}