import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_11315_오목판정 {
	private static int N;
	private static char[][] map;
	private static final int[] dx = { -1, 1, 0, 0, -1, 1, -1, 1 };
	private static final int[] dy = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static boolean isPossible(int x, int y) {
		for(int d=0;d<8;d++) {
			int cnt = 1;

			int nx = x + dx[d];
			int ny = y + dy[d];
			
			while(true) {
				if(isRange(nx, ny) && map[nx][ny] == 'o') {
					cnt++;
					
					nx += dx[d];
					ny += dy[d];
				}else break;
			}
			
			if(5 <= cnt) return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			map = new char[N][N];
			
			for(int i=0;i<N;i++) {
				String input = br.readLine();
				for(int j=0;j<N;j++)
					map[i][j] = input.charAt(j);
			}
			
			boolean flag = false;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j] == 'o') {
						if(isPossible(i, j)) {
							flag = true;
							break;
						}
					}
				}
				
				if(flag) break;
			}
			
			if(flag) sb.append("#" + tc + " YES\n");
			else sb.append("#" + tc + " NO\n");
		}

		System.out.print(sb.toString().trim());
	}
}