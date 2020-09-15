import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_백준_2578_빙고 {
	private static void display(int[][] map, int num) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(map[i][j] == num) {
					map[i][j] = 0;

					return;
				}
			}
		}
	}

	private static int check(int[][] map) {
		int bingo = 0;

		for(int i=0;i<5;i++) {
			boolean flag = true;
			for(int j=0;j<5;j++) {
				if(map[i][j] != 0) {
					flag = false;

					break;
				}
			}

			if(flag) bingo++;
		}

		for(int j=0;j<5;j++) {
			boolean flag = true;
			for(int i=0;i<5;i++) {
				if(map[i][j] != 0) {
					flag = false;

					break;
				}
			}

			if(flag) bingo++;
		}

		boolean flag = true;
		for(int i=0;i<5;i++) {
			if(map[i][i] != 0) {
				flag = false;

				break;
			}
		}

		if(flag) bingo++;

		flag = true;
		for(int i=0;i<5;i++) {
			if(map[i][4-i] != 0) {
				flag = false;

				break;
			}
		}

		if(flag) bingo++;

		return bingo;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		int[][] map = new int[5][5];

		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<5;j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");

			while(st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));
		}

		int cnt = 0;
		while(true) {
			int value = list.get(0);
			list.remove(0);
			cnt++;

			display(map, value);
			int result = check(map);

			if(3 <= result) {
				System.out.print(cnt);

				return;
			}
		}
	}
}