import java.util.Arrays;

public class Solution_KAKAO_카카오프렌즈컬러링북 {
	private static int area;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };

	public static boolean isRange(int x, int y, int m, int n) {
		if(0 <= x && x < m && 0 <= y && y < n) return true;
		else return false;
	}
	
	public static void dfs(int x, int y, int color, int m, int n, int[][] picture) {
		visit[x][y] = true;
		area++;
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			if(isRange(nx, ny, m, n) && !visit[nx][ny] && picture[nx][ny] == color) dfs(nx, ny, color, m, n, picture);
		}
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;

		area = 0;
		visit = new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(!visit[i][j] && picture[i][j] != 0) {
					area = 0;
					numberOfArea++;

					dfs(i, j, picture[i][j], m, n, picture);
					
					maxSizeOfOneArea = maxSizeOfOneArea < area ? area : maxSizeOfOneArea;  
				}
			}
		}
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public static void main(String[] args) {
		int[][] picture = {
				{ 1, 1, 1, 0 },
				{ 1, 2, 2, 0 },
				{ 1, 0, 0, 1 },
				{ 0, 0, 0, 1 },
				{ 0, 0, 0, 3 },
				{ 0, 0, 0, 3 },

		};

		System.out.println(Arrays.toString(solution(6, 4, picture)));
	}
}