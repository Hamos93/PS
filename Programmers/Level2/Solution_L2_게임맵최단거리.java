import java.util.LinkedList;
import java.util.Queue;

public class Solution_L2_게임맵최단거리 {
	public static int solution(int[][] maps) {
		int n = maps.length;
		int m = maps[0].length;
		
		int[] dx = new int[] { -1, 1, 0, 0 };
		int[] dy = new int[] { 0, 0, -1, 1 };
		
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[n][m];
		
		queue.offer(new int[] { 0, 0, 1 });
		visit[0][0] = true;
		
		int distance = -1;
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			
			if(x == n-1 && y == m-1) {
				distance = cnt;
				break;
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < n && 0 <= ny && ny < m && !visit[nx][ny] && maps[nx][ny] == 1) {
					queue.offer(new int[] { nx, ny, cnt + 1 });
					visit[nx][ny] = true;
				}
			}
		}

		return distance;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{ 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 0, 0, 0, 0, 1 }}));
	}
}