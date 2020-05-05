package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1987_알파벳 {
	private static int R, C, cnt, answer;
	private static char[][] map;
	private static boolean[] visit;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };

	private static void dfs(int i, int j){
		if(answer < cnt) answer = cnt;

		// 최대의 경우 알파벳 26개
		if(cnt == 26) return;
		
		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0<=ni && ni<R && 0<=nj && nj<C && !visit[map[ni][nj] - 65]){
				cnt++;
				visit[map[ni][nj] - 65] = true;
				
				dfs(ni, nj);
				
				visit[map[ni][nj] - 65] = false;
				cnt--;
			}
		}
	} 
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		visit = new boolean[26];
		for(int i=0;i<R;i++){
			String line = br.readLine();
			for(int j=0;j<C;j++)
				map[i][j] = line.charAt(j);
		}
		
		// (0, 0) 포함
		cnt = 1;
		answer = 0;
		
		// (0, 0)에 해당하는 알파벳 방문 처리
		visit[map[0][0] - 65] = true;
		dfs(0, 0);
		
		System.out.print(answer);
	}
}