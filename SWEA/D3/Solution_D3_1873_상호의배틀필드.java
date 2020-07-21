import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_1873_상호의배틀필드 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine(), " ");

			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			char[][] map = new char[H][W];

			int idx = 0, jdx = 0, dir = 0;
			for(int i=0;i<H;i++) {
				String line = br.readLine().trim();
				for(int j=0;j<W;j++) {
					map[i][j] = line.charAt(j);

					if(map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						idx = i;
						jdx = j;
					
						if(map[i][j] == '^') dir = 1;
						if(map[i][j] == 'v') dir = 2;
						if(map[i][j] == '<') dir = 3;
						if(map[i][j] == '>') dir = 4;
					}
				}
			}

			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			String input = br.readLine().trim();

			for(int i=0;i<N;i++) {
				char ch = input.charAt(i);

				if(ch == 'U') {
					if(0 <= idx - 1 && map[idx-1][jdx] == '.') {
						map[--idx][jdx] = '^';
						map[idx + 1][jdx] = '.';
					}else map[idx][jdx] = '^';

					dir = 1;
				}

				if(ch == 'D') {
					if(idx + 1 < H && map[idx+1][jdx] == '.') {
						map[++idx][jdx] = 'v';
						map[idx - 1][jdx] = '.';
					}else map[idx][jdx] = 'v';

					dir = 2;
				}

				if(ch == 'L') {
					if(0 <= jdx - 1 && map[idx][jdx-1] == '.') {
						map[idx][--jdx] = '<';
						map[idx][jdx + 1] = '.';
					}else map[idx][jdx] = '<';

					dir = 3;
				}

				if(ch == 'R') {
					if(jdx + 1 < W && map[idx][jdx+1] == '.') {
						map[idx][++jdx] = '>';
						map[idx][jdx - 1] = '.';
					}else map[idx][jdx] = '>';

					dir = 4;
				}

				if(ch == 'S') {
					int ni = idx;
					int nj = jdx;
					
					if(dir == 1) {
						while(0 <= ni - 1 && map[ni - 1][nj] != '#')
							if(map[--ni][nj] == '*') {
								map[ni][nj] = '.';
								break;
							}
					}	
					
					if(dir == 2) {
						while(ni + 1 < H && map[ni + 1][nj] != '#')
							if(map[++ni][nj] == '*') {
								map[ni][nj] = '.';
								break;
							}
					}	
					
					if(dir == 3) {
						while(0 <= nj - 1 && map[ni][nj - 1] != '#')
							if(map[ni][--nj] == '*') {
								map[ni][nj] = '.';
								break;
							}
					}

					if(dir == 4) {
						while(nj + 1 < W && map[ni][nj + 1] != '#')
							if(map[ni][++nj] == '*') {
								map[ni][nj] = '.';
								break;
							}
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + " ");
			
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++)
					sb.append(map[i][j]);
				sb.append("\n");
			}
		
			System.out.print(sb.toString());
		}
	}
}