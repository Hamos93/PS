import java.util.Scanner;

public class Main_백준_1932_정수삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// d[i][j]: i행 j열까지의 최대가 되는 경로 합
		int[][] d = new int[n][n];
		d[0][0] = sc.nextInt();

		for(int i=1;i<n;i++) {
			for(int j=0;j<=i;j++) {
				d[i][j] = sc.nextInt();

				if(j == 0) d[i][j] += d[i-1][j];
				else if(i == j) d[i][j] += d[i-1][j-1];
				else d[i][j] += Math.max(d[i-1][j-1], d[i-1][j]);
			}
		}

		int max = 0;
		for(int j=0;j<n;j++)
			max = max < d[n-1][j] ? d[n-1][j] : max;

		System.out.print(max);
	}
}