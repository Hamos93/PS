import java.util.Arrays;

public class Solution_L2_삼각달팽이 {
	public static int[] solution(int n) {
		int max = (n * (n+1)) / 2;
		int[][] arr = new int[n][n];

		int r = -1, c = 0, k = 0;
		while(k < max) {
			while(r + 1 < n && arr[r+1][c] == 0) arr[++r][c] = ++k;
			while(c + 1 < n && arr[r][c+1] == 0) arr[r][++c] = ++k;
			while(0 < r - 1 && arr[r-1][c-1] == 0) arr[--r][--c] = ++k;
		}

		int[] answer = new int[max];

		int idx = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++)
				answer[idx++] = arr[i][j];
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1)));
	}
}