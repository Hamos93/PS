import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1018_체스판다시칠하기 {
	public static int color(char[][] arr) {
		char ch1 = ' ';
		char ch2 = ' ';

		int cnt1 = 0;
		for(int i=0;i<8;i++) {
			if(i % 2 == 0) {
				ch1 = 'W';
				ch2 = 'B';
			}else {
				ch1 = 'B';
				ch2 = 'W';
			}

			for(int j=0;j<8;j++) {
				if(j % 2 == 0 && arr[i][j] != ch1) cnt1++;
				if(j % 2 == 1 && arr[i][j] != ch2) cnt1++; 
			}
		}

		int cnt2 = 0;
		for(int i=0;i<8;i++) {
			if(i % 2 == 0) {
				ch1 = 'B';
				ch2 = 'W';
			}else {
				ch1 = 'W';
				ch2 = 'B';
			}

			for(int j=0;j<8;j++) {
				if(j % 2 == 0 && arr[i][j] != ch1) cnt2++;
				if(j % 2 == 1 && arr[i][j] != ch2) cnt2++;
			}
		}

		return Math.min(cnt1, cnt2);
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] map = new char[N][M];
		for(int i=0;i<N;i++) {
			String input = br.readLine();
			for(int j=0;j<M;j++)
				map[i][j] = input.charAt(j);
		}

		int result = Integer.MAX_VALUE;
		for(int i=0;i<=N-8;i++) {
			for(int j=0;j<=M-8;j++) {
				char[][] arr = new char[8][8];
				for(int r=i;r<i+8;r++) {
					for(int c=j;c<j+8;c++) 
						arr[r - i][c - j] = map[r][c]; 
				}

				result = Math.min(result, color(arr));
			}
		}

		System.out.print(result);
	}
}