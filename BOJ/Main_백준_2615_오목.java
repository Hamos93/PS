import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_2615_오목 {
	private static int cnt;
	private static int[][] arr;
	public static boolean isRange(int x, int y) {
		if(1 <= x && x < 20 && 1 <= y && y < 20) 
			return true;
		
		return false;
	}
	
	public static boolean solve(int x, int y, int color) {
		int[] dx = new int[2];
		int[] dy = new int[2];
		
		for(int i=0;i<4;i++) {
			switch (i) {
			case 0:
				cnt = 1;

				dx[0] = -1; dx[1] = 1;
				dy[0] = 0; dy[1] = 0;
				
				for(int d=0;d<2;d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					
					while(isRange(nx, ny) && arr[nx][ny] == color) {
						nx += dx[d];
						ny += dy[d];
						
						cnt++;
					}
				}

				if(cnt == 5) return true;
				
				break;
			case 1:
				cnt = 1;

				dx[0] = 0; dx[1] = 0;
				dy[0] = -1; dy[1] = 1;
				
				for(int d=0;d<2;d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					
					while(isRange(nx, ny) && arr[nx][ny] == color) {
						nx += dx[d];
						ny += dy[d];
						
						cnt++;
					}
				}

				if(cnt == 5) return true;
				
				break;
			case 2:
				cnt = 1;

				dx[0] = -1; dx[1] = 1;
				dy[0] = -1; dy[1] = 1;
				
				for(int d=0;d<2;d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					
					while(isRange(nx, ny) && arr[nx][ny] == color) {
						nx += dx[d];
						ny += dy[d];
						
						cnt++;
					}
				}

				if(cnt == 5) return true;
				
				break;
			case 3:
				cnt = 1;

				dx[0] = -1; dx[1] = 1;
				dy[0] = 1; dy[1] = -1;
				
				for(int d=0;d<2;d++) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					
					while(isRange(nx, ny) && arr[nx][ny] == color) {
						nx += dx[d];
						ny += dy[d];
						
						cnt++;
					}
				}

				if(cnt == 5) return true;
				
				break;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		arr = new int[20][20];
		for(int i=1;i<20;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<20;j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		for(int j=1;j<20;j++) {
			for(int i=1;i<20;i++) {
				if(arr[i][j] != 0) {
					if(solve(i, j, arr[i][j])) {
						System.out.print(arr[i][j] + "\n" + i + " " + j);
						return;
					}
				}
			}
		}
		
		System.out.print("0");
	}
}