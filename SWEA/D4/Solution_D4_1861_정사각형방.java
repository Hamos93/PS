import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1861_정사각형방 {
	private static int[][] room;
	private static int N, len, answer;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };
	
	private static void dfs(int i, int j, int num, int start, int cnt) {
		if(len < cnt) {
			len = cnt;
			answer = start;
		}else if(len == cnt) answer = start < answer ? start : answer;
		
		for(int d=0;d<4;d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
		
			if(!isRange(ni, nj) || room[ni][nj] - room[i][j] != 1) continue;
			
			dfs(ni, nj, room[ni][nj], start, cnt + 1);
		}
	}
	
	private static boolean isRange(int i, int j) {
		if(0 <= i && i < N && 0 <= j && j < N) return true;
	
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			room = new int[N][N];
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<N;j++)
					room[i][j] = Integer.parseInt(st.nextToken());
			}
			
			len = 0; answer = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++)
					dfs(i, j, room[i][j], room[i][j], 1);
			}

			System.out.println("#" + tc + " " + answer + " " + len);
		}
	}
}