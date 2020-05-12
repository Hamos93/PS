import java.util.Scanner;

public class Solution_D2_1954_달팽이숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();

			int[][] map = new int[N][N];

			int num = 1;
			int idx = 0, jdx = -1;
			for(int k=0;k<2*N-1;k++) {
				while(++jdx < N && map[idx][jdx] == 0) map[idx][jdx] = num++;
				jdx--;
				
				while(++idx < N && map[idx][jdx] == 0) map[idx][jdx] = num++;
				idx--;
				
				while(0 <= --jdx && map[idx][jdx] == 0) map[idx][jdx] = num++;
				jdx++;
				 

				while(0 <= --idx && map[idx][jdx] == 0) map[idx][jdx] = num++;
				idx++; 
			}

			StringBuilder sb = new StringBuilder();
			sb.append("#" + tc + "\n");
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(j == N-1) sb.append(map[i][j]);
					else sb.append(map[i][j] + " ");
				}
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
		}

	}
}