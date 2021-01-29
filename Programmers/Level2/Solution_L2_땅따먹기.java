
public class Solution_L2_땅따먹기 {
	public static int solution(int[][] land) {
		int answer = 0;
		int len = land.length;
		
		int[][] dp = new int[len][4];
		for(int j=0;j<4;j++)
			dp[0][j] = land[0][j];
		
		for(int i=1;i<len;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					if(j == k) continue;
					dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i-1][k]);
					
					answer = Math.max(answer, dp[i][j]);
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.print(solution(new int[][] { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } }));
	}
}