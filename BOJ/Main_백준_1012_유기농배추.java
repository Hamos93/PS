package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1012_유기농배추 {
	private static int N, M;
	private static int[][] farm;
	private static boolean[][] visit;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };
	
	private static void dfs(int i, int j){
		visit[i][j] = true;
		
		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0>ni || ni>=N || 0>nj || nj>=M || visit[ni][nj] || farm[ni][nj] == 0) continue;
			
			dfs(ni, nj);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++){
			st = new StringTokenizer(br.readLine(), " ");
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			farm = new int[N][M];
			visit = new boolean[N][M];
		
			while(K-- > 0){
				st = new StringTokenizer(br.readLine(), " ");
				
				int j = Integer.parseInt(st.nextToken());
				int i = Integer.parseInt(st.nextToken());
				
				farm[i][j] = 1;
			}
			
			int cnt = 0;
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					if(!visit[i][j] && farm[i][j] == 1){
						cnt++;
						
						dfs(i, j);
					}
				}
			}
			
			System.out.println(cnt);
		}
	}
}