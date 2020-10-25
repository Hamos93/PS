
public class Solution_L2_행렬의곱셈 {
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int N = arr1.length;
		int M = arr2.length;
		int K = arr2[0].length;
		
		int[][] answer = new int[N][K];

		for(int i=0;i<N;i++) {
			for(int k=0;k<K;k++) {
				for(int j=0;j<M;j++) {
					answer[i][k] += arr1[i][j] * arr2[j][k];
				}
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 3, 2 }, { 4, 1 }};
		int[][] arr2 = { { 3, 3 }, { 3, 3 }};

		int[][] answer = solution(arr1, arr2);
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer[i].length;j++)
				System.out.print(answer[i][j] + " ");
			System.out.println();
		}
	}
}