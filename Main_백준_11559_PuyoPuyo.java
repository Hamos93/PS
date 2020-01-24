import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main_백준_11559_PuyoPuyo {
	private static final int R = 12;
	private static final int C = 6;
	private static char[][] map;
	private static boolean[][] visit;
	private static List<int[]> list;
	private static final int[] di = { -1, 1, 0, 0 };
	private static final int[] dj = { 0, 0, -1, 1 };

	private static void dfs(int i, int j, char color){
		visit[i][j] = true;
		list.add(new int[]{i, j});

		for(int d=0;d<4;d++){
			int ni = i + di[d];
			int nj = j + dj[d];

			if(0<=ni && ni<R && 0<=nj && nj<C && !visit[ni][nj] && map[ni][nj] == color) dfs(ni, nj, color);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		map = new char[R][C];
		for(int i=0;i<R;i++){
			String line = br.readLine();
			for(int j=0;j<C;j++)
				map[i][j] = line.charAt(j);
		}

		int answer = 0;
		while(true){
			boolean flag = false;
			visit = new boolean[R][C];
			
			// 4개 이상의 연속된 뿌요가 있는지 탐색
			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){
					if(!visit[i][j] && map[i][j] != '.'){
						list = new ArrayList<>();

						dfs(i, j, map[i][j]);
						
						// 4개 이상인 경우 뿌요 터트리기
						if(4 <= list.size()){
							flag = true;

							for(int k=0;k<list.size();k++)
								map[list.get(k)[0]][list.get(k)[1]] = '.';
						}
					}
				}
			}

			if(flag) answer++;
			else break;
			
			// 뿌요 재배치
			for(int j=0;j<C;j++){
				for(int i=R-1;0<=i;i--){
					if(map[i][j] != '.'){
						int idx = i;

						while(idx+1<R && map[idx+1][j] == '.') idx++;
						
						if(idx != i){
							map[idx][j] = map[i][j];
							map[i][j] = '.';
						}
					}
				}
			}
		}

		System.out.print(answer);
	}
}