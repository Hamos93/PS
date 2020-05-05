package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_4963_섬의개수 {
	private static int w, h, answer;
	private static int[][] land;
	private static boolean[][] visit;
	private static int[] di = { -1, 1, 0, 0, -1, -1, 1, 1 };
	private static int[] dj = { 0, 0, -1, 1, -1, 1, 1, -1 };
	
	private static void dfs(int i, int j){
		visit[i][j] = true;
		
		for(int d=0;d<8;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0>ni || ni>=h || 0>nj || nj>=w || visit[ni][nj] || land[ni][nj] == 0) continue;
			
			dfs(ni, nj);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		while(true){
			st = new StringTokenizer(br.readLine(), " ");
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) break;
			
			land = new int[h][w];
			visit = new boolean[h][w];
			
			for(int i=0;i<h;i++){
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<w;j++)
					land[i][j] = Integer.parseInt(st.nextToken());
			}
			
			answer = 0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(!visit[i][j] && land[i][j] == 1){
						answer++;
						
						dfs(i, j);
					}
				}
			}
			
			System.out.println(answer);
		}
	}
}