import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_3190_뱀 {
	private static int N;
	private static int[][] map;
	private static int[] dx = { -1, 1, 0 , 0 };
	private static int[] dy = { 0 , 0, -1, 1 };

	private static boolean isRange(int r, int c, List<int[]> list) {
		// 벽 검사
		if(r < 1 || N < r || c < 1 || N < c) return false;

		// 뱀의 몸 검사
		for(int i=0;i<list.size();i++) {
			int R = list.get(i)[0];
			int C = list.get(i)[1];

			if(r == R && c == C) return false;
		}

		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];

		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());

		// 사과의 위치
		while(0 < K--) {
			st = new StringTokenizer(br.readLine(), " ");

			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			map[r][c] = 1;
		}

		st = new StringTokenizer(br.readLine(), " ");
		int L = Integer.parseInt(st.nextToken());

		// 방향 전환 목록
		Queue<String[]> time = new LinkedList<>();
		while(0 < L--) {
			st = new StringTokenizer(br.readLine(), " ");

			time.offer(new String[] { st.nextToken(), st.nextToken() });
		}

		// 뱀의 좌표
		List<int[]> snake = new ArrayList<>();
		snake.add(new int[] { 1, 1 });

		int second = 0, dir = 3;
		while(true) {
			second++;

			int x = snake.get(0)[0]; int y = snake.get(0)[1];
			int nx = x + dx[dir]; int ny = y + dy[dir];

			if(!isRange(nx, ny, snake)) break;

			// 다음 좌표가 사과인 경우
			if(map[nx][ny] == 1) {
				map[nx][ny] = 0;
				snake.add(0, new int[] { nx, ny });
			}else {
				snake.add(0, new int[] { nx, ny });
				snake.remove(snake.size() - 1);
			}

			if(!time.isEmpty() && second == Integer.parseInt(time.peek()[0])) {
				String[] poll = time.poll();

				char X = poll[1].charAt(0);
				if(X == 'D') {
					switch (dir) {
					case 0:
						dir = 3;
						break;
					case 1:
						dir = 2;
						break;
					case 2:
						dir = 0;
						break;
					case 3:
						dir = 1;
						break;
					}
				}else {
					switch(dir) {
					case 0:
						dir = 2;
						break;
					case 1:
						dir = 3;
						break;
					case 2:
						dir = 1;
						break;
					case 3:
						dir = 0;
						break;
					}
				}
			}
		}
		
		System.out.print(second);
	}
}