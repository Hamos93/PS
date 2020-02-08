package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2573_빙산 {
	private static int R, C;
	private static int[][] iceberg;
	private static int[][] copyMap;
	private static boolean[][] visit;
	private static int[] di = { -1, 1, 0, 0 };
	private static int[] dj = { 0, 0, -1, 1 };

	private static void melting(){
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(iceberg[i][j] != 0){
					int zeroCnt = 0;
					
					for(int d=0;d<4;d++){
						int ni = i + di[d];
						int nj = j + dj[d];
						
						if(0<=ni && ni<R && 0<=nj && nj<C && iceberg[ni][nj] == 0) zeroCnt++;
					}
					
					if(iceberg[i][j] - zeroCnt <= 0) copyMap[i][j] = 0; 
					else copyMap[i][j] = iceberg[i][j] - zeroCnt;
				}
			}
		}
	}
	
	private static void copy(){
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++)
				iceberg[i][j] = copyMap[i][j];
		}
	}
	
	private static void dfs(int i, int j){
		visit[i][j] = true;
		
		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0<=ni && ni<R && 0<=nj && nj<C && !visit[ni][nj] && iceberg[ni][nj] != 0) dfs(ni, nj);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		iceberg = new int[R][C];
		copyMap = new int[R][C];
		
		for(int i=0;i<R;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<C;j++)
				iceberg[i][j] = copyMap[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int year = 0;
		while(true){
			// 빙산 녹이기
			melting();
			
			year++;
			
			// 원본 <- 임시
			copy();
			
			// 빙산 덩어리 개수 세기
			visit = new boolean[R][C];
			int cnt = 0;
			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){
					if(iceberg[i][j] != 0 && !visit[i][j]){
						cnt++;
						
						dfs(i, j);
					}
				}
			}
			
			// 빙산이 다 녹을 때까지 분리되지 않는 경우
			if(cnt == 0) {
				System.out.print("0");
				return;
			}
			
			// 빙산이 두 덩어리 이상으로 분리되는 경우
			if(2 <= cnt) {
				System.out.print(year);
				return;
			}
		}
	}
}