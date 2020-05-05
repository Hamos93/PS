package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2667_단지번호붙이기 {
	private static int N, cnt;
	private static int[][] map;
	private static boolean[][] visit;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };
	
	private static void dfs(int i, int j){
		visit[i][j] = true;
		cnt++;
		
		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];
	
			if(0>ni || ni>=N || 0>nj || nj>=N || visit[ni][nj] || map[ni][nj] == 0) continue;
			
			dfs(ni, nj);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i=0;i<N;i++){
			String line = br.readLine();
			for(int j=0;j<N;j++)
				map[i][j] = line.charAt(j) - '0';
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(!visit[i][j] && map[i][j] == 1){
					cnt = 0;
					
					dfs(i, j);
					
					list.add(cnt);
				}
			}
		}
		
		Collections.sort(list);

		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}