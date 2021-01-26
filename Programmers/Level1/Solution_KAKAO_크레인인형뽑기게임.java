import java.util.Stack;

public class Solution_KAKAO_크레인인형뽑기게임 {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for(int i=0;i<moves.length;i++) {
			int col = moves[i] - 1;

			int doll = 0;
			for(int row=0;row<board.length;row++) {
				if(board[row][col] != 0) {
					doll = board[row][col];
					board[row][col] = 0;

					break;
				}
			}

			if(doll == 0) continue;

			if(stack.isEmpty()) stack.push(doll);
			else {
				if(stack.peek() == doll) {
					stack.pop();
					answer++;
				}else stack.push(doll);
			}
		}

		return answer * 2;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { 
			{ 0, 0, 0, 0, 0 }, 
			{ 0, 0, 1, 0, 3 },
			{ 0, 2, 5, 0, 1 },
			{ 4, 2, 4, 4, 2 },
			{ 3, 5, 1, 3, 1 }},
				new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }));
	}
}