import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_3085_사탕게임 {
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };
	
	public static int calc(int x, int y, char candy, char[][] map) {
		int cnt1 = 1, cnt2 = 1;
		
		int nx = x;
		while(0 <= nx-1 && map[nx-1][y] == candy) {
			nx--;
			cnt1++;
		}
		
		nx = x;
		while(nx + 1 < map.length && map[nx+1][y] == candy) {
			nx++;
			cnt1++;
		}
		
		int ny = y;
		while(0 <= ny-1 && map[x][ny-1] == candy) {
			ny--;
			cnt2++;
		}
		
		ny = y;
		while(ny+1 < map.length && map[x][ny+1] == candy) {
			ny++;
			cnt2++;
		}
		
		return cnt1 < cnt2 ? cnt2 : cnt1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		char[][] map = new char[N][N];
		
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<N;j++)
				map[i][j] = input.charAt(j);
		}
		
		int answer = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int d=0;d<4;d++) {
					int ni = i + di[d];
					int nj = j + dj[d];
				
					if(0 > ni || ni >= N || 0 > nj || nj >= N) continue;
					
					char temp = map[i][j];
					map[i][j] = map[ni][nj];
					map[ni][nj] = temp;
					
					int result = Math.max(calc(i, j, map[i][j], map), calc(ni, nj, map[ni][nj], map));
					answer = Math.max(answer, result);
					
					temp = map[i][j];
					map[i][j] = map[ni][nj];
					map[ni][nj] = temp;
				}
			}
		}
		
		System.out.print(answer);
	}
}