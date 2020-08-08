import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_4615_재미있는오셀로게임 {
	private static char[][] map;
	private static int N;
	private static final int[] di = { -1, 1, 0, 0, -1, 1, -1, 1 };
	private static final int[] dj = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	private static void play(int i, int j, int N) {
		for(int d=0;d<8;d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			
			while(true) {
				if(!isRange(ni, nj) || map[ni][nj] == 0) break;
				
				if(map[i][j] != map[ni][nj]) {
					ni += di[d];
					nj += dj[d];
				}else break;
			}
			
			if(isRange(ni, nj) && map[ni][nj] == map[i][j]) {
				while(true) {
					if(i == ni && j == nj) break;
				
					map[ni][nj] = map[i][j];
					
					ni -= di[d];
					nj -= dj[d];
				}
			}
		}
	}
	
	private static boolean isRange(int i, int j) {
		if(1 <= i && i <= N && 1 <= j && j <= N) return true;
		else return false;
	}
	
	private static boolean isFull() {
		int cnt = 0;
		
		for(int i=1;i<=N;i++)
			for(int j=1;j<=N;j++)
				if(map[i][j] != 0) cnt++;

		if(N * N == cnt) return true;
		else return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			map = new char[N+1][N+1];

			map[N/2][N/2] = map[N/2 + 1][N/2 + 1] = 'W';
			map[N/2][N/2 + 1] = map[N/2 + 1][N/2] = 'B';
			
			while(0 < M--) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int j = Integer.parseInt(st.nextToken());
				int i = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());

				if(isFull()) break;
			
				if(c == 1) map[i][j] = 'B';
				else map[i][j] = 'W';
				
				play(i, j, N);
			}
			
			int black = 0, white = 0;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(map[i][j] == 'B') black++;
					if(map[i][j] == 'W') white++;
				}
			}
			
			System.out.println("#" + tc + " " + black + " " + white);
		}
	}
}