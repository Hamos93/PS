import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_14502_연구소 {
	private static int N, M;
	private static int[][] laboratory;
	private static int[][] temp;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static void copy() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++)
				temp[i][j] = laboratory[i][j];
		}
	}
	
	private static void bfs(List<int[]> virus) {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[N][M];
		
		for(int i=0;i<virus.size();i++) {
			queue.offer(virus.get(i));
			visit[virus.get(i)[0]][virus.get(i)[1]] = true;
		}
		
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0>nx || nx>=N || 0>ny || ny>=M || visit[nx][ny] || temp[nx][ny] != 0) continue;
				
				temp[nx][ny] = 2;
				queue.offer(new int[] {nx, ny});
				visit[nx][ny] = true;	
			}
		}
	}
	
	private static int count() {
		int cnt = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) 
				if(temp[i][j] == 0) cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		laboratory = new int[N][M];
		List<int[]> virus = new ArrayList<>();
		
		// 1. 입력
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<M;j++) {
				laboratory[i][j] = Integer.parseInt(st.nextToken());
				
				// 바이러스 위치 리스트에 저장
				if(laboratory[i][j] == 2) virus.add(new int[] {i, j});
			}
		}
		
		int answer = 0;
		
		// 2. 벽 세우기
		for(int i1=0;i1<N;i1++) {
			for(int j1=0;j1<M;j1++) {
				if(laboratory[i1][j1] == 0) {
					laboratory[i1][j1] = 1;
				
					for(int i2=i1;i2<N;i2++) {
						for(int j2=0;j2<M;j2++) {
							if(i1 == i2 && j2 < j1) continue;
							if(laboratory[i2][j2] == 0) {
								laboratory[i2][j2] = 1;
								
								for(int i3=i2;i3<N;i3++) {
									for(int j3=0;j3<M;j3++) {
										if(i2 == i3 && j3 < j2) continue;
										if(laboratory[i3][j3] == 0) {
											laboratory[i3][j3] = 1;
										
											// 3. 현재 맵 임시 저장
											temp = new int[N][M];
											copy();
											
											// 4. 바이러스 증식
											bfs(virus);
											
											// 5. 안전영역 카운트
											int result = count();
											answer = answer < result ? result : answer;

											laboratory[i3][j3] = 0;
										}
									}
								}
								laboratory[i2][j2] = 0;
							}
						}
					}
					laboratory[i1][j1] = 0;
				}
			}
		}
		
		System.out.print(answer);
	}
}