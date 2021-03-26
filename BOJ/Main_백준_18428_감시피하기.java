import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_백준_18428_감시피하기 {
	private static int N;
	private static char[][] map;
	private static List<int[]> list;
	private static final int[] dx = { -1, 1, 0, 0 };
	private static final int[] dy = { 0, 0, -1, 1 };
	
	public static boolean isRange(int x, int y) {
		if(0 <= x && x < N && 0 <= y && y < N) return true;
		else return false;
	}
	
	public static boolean search(){
		int size = list.size();
		
		for(int i=0;i<size;i++) {
			int[] get = list.get(i);
			int x = get[0], y = get[1];
		
			for(int d=0;d<4;d++) {
				int nx = x;
				int ny = y;
				
				while(true) {
					nx += dx[d];
					ny += dy[d];
					
					if(!isRange(nx, ny) || map[nx][ny] == 'O') break;
					if(map[nx][ny] == 'S') return false;
				}
			}
		
		}
		
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		map = new char[N][N];

		list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				map[i][j] = st.nextToken().charAt(0);

				if(map[i][j] == 'T') list.add(new int[] { i, j });
			}
		}

		for(int i1=0;i1<N;i1++) {
			for(int j1=0;j1<N;j1++) {
				if(map[i1][j1] == 'X') {
					map[i1][j1] = 'O'; 
					for(int i2=0;i2<N;i2++) {
						for(int j2=0;j2<N;j2++) {
							if(i1 == i2 && j1 == j2) continue;
							if(map[i2][j2] == 'X') {
								map[i2][j2] = 'O';
								for(int i3=0;i3<N;i3++) {
									for(int j3=0;j3<N;j3++) {
										if(i1 == i3 && j1 == j3) continue;
										if(i2 == i3 && j2 == j3) continue;
										if(map[i3][j3] == 'X') {
											map[i3][j3] = 'O';

											if(search()) {
												System.out.println("YES");
												return;
											}

											map[i3][j3] = 'X';
										}
									}
								}

								map[i2][j2] = 'X';
							}
						}
					}

					map[i1][j1] = 'X';
				}
			}
		}

		System.out.print("NO");
	}
}