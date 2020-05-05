package DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_2146_다리만들기 {
	private static int N, answer;
	private static int[][] map;
	private static boolean[][] visit;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };
	
	private static void dfs(int i, int j, int num) {
		for(int d=0;d<di.length;d++) {
			int ni = i + di[d];
			int nj = j + dj[d];
			
			if(0<=ni && ni<N && 0<=nj && nj<N && map[ni][nj] == 1 && !visit[ni][nj]) {
				map[ni][nj] = num;
				visit[ni][nj] = true;
				dfs(ni, nj, num);
			}
		}
	}
	
	private static void bfs(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		int k = 0;
		
		queue.offer(new int[] {i, j, k});
		visit[i][j] = true;
		
		loop: while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			int ii = curr[0];
			int jj = curr[1];
			int cnt = curr[2];
			
			for(int d=0;d<di.length;d++) {
				int ni = ii + di[d];
				int nj = jj + dj[d];
				
				if(0<=ni && ni<N && 0<=nj && nj<N && map[ni][nj] != map[i][j] && !visit[ni][nj]) {
					// 바다가 아닌 다른 구역의 섬이라면 최단경로 찾은 것이므로 탈출
					if(map[ni][nj] != 0) {
						answer = Math.min(answer, cnt+1);
						break loop;
					}
					
					queue.offer(new int[] {ni, nj, cnt+1});
					visit[ni][nj] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];
		visit = new boolean[N][N];
		
		// 1. 지도 입력 (0: 바다, 1: 육지)
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int num = 0;
		// 2. 섬 넘버링
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					num++;
					map[i][j] = num;
					visit[i][j] = true;
					dfs(i, j, num);
				}
			}
		}
		
		// 3. 각 섬마다 BFS로 최단경로 찾기
		answer = Integer.MAX_VALUE;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j] != 0) {
					visit = new boolean[N][N];
					bfs(i, j);
				}
			}
		}
		
		System.out.print(answer-1);
	}
}