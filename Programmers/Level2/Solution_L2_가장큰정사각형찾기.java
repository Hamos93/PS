
public class Solution_L2_가장큰정사각형찾기 {
	public static int solution(int[][] board) {
		int len = 0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(i == 0 || j == 0) {
					len = Math.max(len, board[i][j]);
					continue;
				}
				
				if(board[i][j] != 0)
					board[i][j] = Math.min(Math.min(board[i][j-1], board[i-1][j-1]), board[i-1][j]) + 1;
			
				len = Math.max(len, board[i][j]);
			}
		}
		
		return len * len;
	}
	
	public static void main(String[] args) {
		int[][] board = {
				{ 0, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 0, 0, 1, 0 }
		};
		
		System.out.println(solution(board));
	}
}