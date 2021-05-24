import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_7699_수지의수지맞는여행 {
	private static int R, C, cnt, answer;
	private static char[][] map;
	private static boolean[] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < R && 0 <= y && y < C) return true;
		
		return false;
	}
	
	public static void dfs(int x, int y) {
		if(cnt == 26) {
			answer = 26;
			return;
		}
		
		if(answer < cnt)
			answer = cnt;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny) && !visit[map[nx][ny] - 65]) {
				visit[map[nx][ny] - 65] = true;
				cnt++;
				
				dfs(nx, ny);
				
				cnt--;
				visit[map[nx][ny] - 65] = false;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
	
			map = new char[R][C];
			for(int i=0;i<R;i++) {
				String input = br.readLine();
				for(int j=0;j<C;j++)
					map[i][j] = input.charAt(j);
			}
		
			visit = new boolean[26];
			
			visit[map[0][0] - 65] = true;
			answer = cnt = 1;

			dfs(0, 0);
			
			sb.append("#" + tc + " " + answer + "\n");
		}

		System.out.print(sb.toString().trim());
	}
}