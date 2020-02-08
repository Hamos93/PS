package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2636_치즈 {
	private static int R, C;
	private static int[][] map;
	private static boolean[][] visit;
	private static int[] di = { -1, 1, 0, 0 };
	private static int[] dj = { 0, 0, -1 ,1 };

	private static void melting(int i, int j){
		visit[i][j] = true;
		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0<=ni && ni<R && 0<=nj && nj<C && !visit[ni][nj]){
				if(map[ni][nj] == 1) {
					visit[ni][nj] = true;
					map[ni][nj] = 0;
				
					continue;
				}
				
				if(map[ni][nj] == 0) melting(ni, nj);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new int[R][C];
		
		int cheeze = 0;
		for(int i=0;i<R;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<C;j++){
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) cheeze++;
			}
		}
		
		int time = 0;
		while(true){
			// 치즈녹이기
			visit = new boolean[R][C];
			melting(0, 0);
			
			time++;
			
			// 치즈 조각 카운트
			int cnt = 0;
			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){
					if(map[i][j] == 1) cnt++;
				}
			}
			
			if(cnt == 0) {
				System.out.print(time + "\n" + cheeze);
				return;
			}else cheeze = cnt;
		}
	}
}