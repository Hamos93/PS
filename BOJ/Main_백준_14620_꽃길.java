import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14620_꽃길 {
	private static int N;
	private static int[][] map;
	private static boolean[][] visit;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	private static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) return true;
		else return false;
	}
	
	private static boolean check(int x, int y) {
		visit[x][y] = true;
		
		boolean flag = true;
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
	
			if(!isRange(nx, ny) || visit[nx][ny]) {
				flag = false;
				break;
			}
			
			visit[nx][ny] = true;
		}
		
		return flag;
	}
	
	private static int calcPrice(int x, int y) {
		int price = map[x][y];
		
		for(int d=0;d<4;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
		
			price += map[nx][ny];
		}
		
		return price;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		map = new int[N][N];

		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		int answer = Integer.MAX_VALUE;
		for(int i1=0;i1<N;i1++) {
			for(int j1=0;j1<N;j1++) {

				for(int i2=0;i2<N;i2++) {
					for(int j2=0;j2<N;j2++) {
						if(i1 == i2 && j1 == j2) continue;

						for(int i3=0;i3<N;i3++) {
							for(int j3=0;j3<N;j3++) {
								if(i1 == i3 && j1 == j3) continue;
								if(i2 == i3 && j2 == j3) continue;
								
								visit = new boolean[N][N];
								if(!check(i1, j1) || !check(i2, j2) || !check(i3, j3)) continue;

								int price = calcPrice(i1, j1) + calcPrice(i2, j2) + calcPrice(i3, j3);
								answer = price < answer ? price : answer;
							}
						}
					}
				}
			}
		}
		
		System.out.print(answer);
	}
}