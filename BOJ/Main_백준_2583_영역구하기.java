import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_2583_영역구하기 {
	private static int N, M, AREA;
	private static int[][] rectangle;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void dfs(int x, int y) {
		AREA++;
		visit[x][y] = true;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(0>nx || nx>=N || 0>ny || ny>=M || visit[nx][ny] || rectangle[nx][ny] == 1) continue;
			
			dfs(nx, ny);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		rectangle = new int[N][M];
		visit = new boolean[N][M];
		
		while(K-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int i=x1;i<x2;i++)
				for(int j=y1;j<y2;j++)
					rectangle[i][j] = 1;
		}

		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(!visit[i][j] && rectangle[i][j] == 0) {
					AREA = 0;
					
					dfs(i, j);

					list.add(AREA);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i) + " ");
	}
}