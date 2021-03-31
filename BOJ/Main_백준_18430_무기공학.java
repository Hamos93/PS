import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_18430_무기공학 {
	private static int N, M, result;
	private static int[][] board;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	public static void dfs(int x, int y, int value) {
		if(y == M) {
			y = 0;
			x++;
		}
		
		if(x == N) {
			result = Math.max(result, value);
			return;
		}
		
		if(!visit[x][y]) {
			if(0 <= y+dy[2] && x+dx[1] < N && !visit[x][y+dy[2]] && !visit[x+dx[1]][y]) {
				visit[x][y] = true;
				visit[x][y+dy[2]] = true;
				visit[x+dx[1]][y] = true;

				dfs(x, y, value + (2 * board[x][y] + board[x][y+dy[2]] + board[x+dx[1]][y]));

				visit[x+dx[1]][y] = false;
				visit[x][y+dy[2]] = false;
				visit[x][y] = false;
			}

			if(0 <= y+dy[2] && 0 <= x+dx[0] && !visit[x][y+dy[2]] && !visit[x+dx[0]][y]) {
				visit[x][y] = true;
				visit[x][y+dy[2]] = true;
				visit[x+dx[0]][y] = true;

				dfs(x, y, value + (2 * board[x][y] + board[x][y+dy[2]] + board[x+dx[0]][y]));

				visit[x+dx[0]][y] = false;
				visit[x][y+dy[2]] = false;
				visit[x][y] = false;
			}

			if(y+dy[3] < M && 0 <= x+dx[0] && !visit[x][y+dy[3]] && !visit[x+dx[0]][y]) {
				visit[x][y] = true;
				visit[x][y+dy[3]] = true;
				visit[x+dx[0]][y] = true;

				dfs(x, y, value + (2 * board[x][y] + board[x][y+dy[3]] + board[x+dx[0]][y]));

				visit[x+dx[0]][y] = false;
				visit[x][y+dy[3]] = false;
				visit[x][y] = false;
			}

			if(y+dy[3] < M && x+dx[1] < N && !visit[x][y+dy[3]] && !visit[x+dx[1]][y]) {
				visit[x][y] = true;
				visit[x][y+dy[3]] = true;
				visit[x+dx[1]][y] = true;

				dfs(x, y, value + (2 * board[x][y] + board[x][y+dy[3]] + board[x+dx[1]][y]));

				visit[x+dx[1]][y] = false;
				visit[x][y+dy[3]] = false;
				visit[x][y] = false;
			}
		}

		dfs(x, y+1, value);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		board = new int[N][M];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++)
				board[i][j] = Integer.parseInt(st.nextToken());
		}

		visit = new boolean[N][M];

		result = 0;
		dfs(0, 0, 0);

		System.out.print(result);
	}
}