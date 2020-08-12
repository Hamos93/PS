import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_1211_Ladder2 {
	private static int[][] ladder;

	private static int search(int r, int c) {
		int len = 1;
		while(r != 99) {
			r++; len++;

			boolean flag = false;
			while(0 <= c-1 && ladder[r][c-1] == 1) {
				c--;
				len++;

				flag = true;
			}

			if(flag) continue;

			while(c+1 < 100 && ladder[r][c+1] == 1) {
				c++;
				len++;
			}
		}

		return len;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			Integer.parseInt(st.nextToken());

			ladder = new int[100][100];
			for(int i=0;i<100;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<100;j++)
					ladder[i][j] = Integer.parseInt(st.nextToken());
			}

			int len = Integer.MAX_VALUE;
			int answer = -1;
			for(int j=0;j<100;j++) {
				if(ladder[0][j] == 1) {
					int result = search(0, j);

					if(result < len) {
						len = result;

						answer = j;
					}
				}
			}

			System.out.println("#" + tc + " " + answer);
		}
	}
}