package BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_7576_토마토 {
	private static int N, M;
	private static int[][] box;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	private static void bfs(List<int[]> list){
		Queue<int[]> queue = new LinkedList<>();

		for(int i=0;i<list.size();i++)
			queue.offer(list.get(i));

		while(!queue.isEmpty()){
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];

			for(int d=0;d<4;d++){
				int nx = x + dx[d];
				int ny = y + dy[d];

				if(0>nx || nx>=N || 0>ny || ny>=M || box[nx][ny] != 0) continue;

				box[nx][ny] = box[x][y] + 1;
				queue.offer(new int[]{nx, ny});
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		box = new int[N][M];
		List<int[]> tomato = new ArrayList<>();
		int cnt = 0;
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++){
				box[i][j] = Integer.parseInt(st.nextToken());

				if(box[i][j] == 0) cnt++;
				if(box[i][j] == 1) tomato.add(new int[]{i,j});
			}
		}

		if(cnt == 0) {
			System.out.print("0");
			return;
		}

		bfs(tomato);

		int answer = 0;
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				if(box[i][j] == 0){
					System.out.print("-1");
					return;
				}

				answer = box[i][j] < answer ? answer : box[i][j];

			}
		}

		System.out.print(answer - 1);
	}
}