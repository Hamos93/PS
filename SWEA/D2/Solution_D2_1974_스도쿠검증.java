import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D2_1974_스도쿠검증 {
	private static int[][] map;
	private static boolean[] visit;

	private static boolean rowCheck(int i) {
		visit = new boolean[10];

		for(int j=0;j<9;j++) {
			if(!visit[map[i][j]]) visit[map[i][j]] = true;
			else return false;
		}
		
		return true;
	}

	private static boolean colCheck(int j) {
		visit = new boolean[10];

		for(int i=0;i<9;i++) {
			if(!visit[map[i][j]]) visit[map[i][j]] = true;
			else return false;
		}
		
		return true;
	}

	private static boolean check(int i, int j) {
		visit = new boolean[10];
		
		for(int r=i;r<i+3;r++) {
			for(int c=j;c<j+3;c++) {
				if(!visit[map[r][c]]) visit[map[r][c]] = true;
				else return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		loop: for(int tc=1;tc<=T;tc++) {
			map = new int[9][9];

			for(int i=0;i<9;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<9;j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}

			for(int i=0;i<9;i++) {
				if(!rowCheck(i)) {
					sb.append("#" + tc + " 0\n");
					continue loop;
				}
			}

			for(int j=0;j<9;j++) {
				if(!colCheck(j)) {
					sb.append("#" + tc + " 0\n");
					continue loop;
				}
			}

			for(int i=0;i<9;i+=3) {
				for(int j=0;j<9;j+=3) {
					if(!check(i, j)) {
						sb.append("#" + tc + " 0\n");
						continue loop;
					}
				}
			}
			
			sb.append("#" + tc + " 1\n");
		}
		
		System.out.print(sb.toString());
	}
}