import java.util.LinkedList;
import java.util.Queue;

public class Solution_KAKAO_키패드누르기 {
	public static int[] findKey(int[][] keypad, int num) {
		int x = 0, y = 0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				if(keypad[i][j] == num) {
					x = i;
					y = j;
				}
			}
		}
		
		return new int[] { x, y };
	}
	
	public static int bfs(int[] thumb, int[][] keypad, int num) {
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visit = new boolean[4][3];
		int result = 0;
		
		queue.offer(new int[] { thumb[0], thumb[1], 0 });
		visit[thumb[0]][thumb[1]] = true;
		
		while(!queue.isEmpty()) {
			int[] poll = queue.poll();
			int x = poll[0], y = poll[1], cnt = poll[2];
			
			if(keypad[x][y] == num) {
				result = cnt;
				break;
			}
			
			for(int d=0;d<4;d++) {
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(0 <= nx && nx < 4 && 0 <= ny && ny < 3 && !visit[nx][ny]) {
					queue.offer(new int[] { nx, ny, cnt + 1 });
					visit[nx][ny] = true;
				}
			}
		
		}
		
		return result;
	}
	
	public static String solution(int[] numbers, String hand) {
		int[][] keypad = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 },
				{ -1, 0, -2 }
		};

		String answer = "";
		int[] leftThumb = { 3, 0 };
		int[] rightThumb = { 3, 2 };
		for(int k=0;k<numbers.length;k++) {
			int num = numbers[k];

			if(num == 1 || num == 4 || num == 7) {
				answer += "L";
				leftThumb = findKey(keypad, num);
			}else if(num == 3 || num == 6 || num == 9) {
				answer += "R";
				rightThumb = findKey(keypad, num);
			}else {
				int left = bfs(leftThumb, keypad, num);
				int right = bfs(rightThumb, keypad, num);
			
				if(left == right) {
					answer += hand.toUpperCase().charAt(0);
					
					if(hand.toUpperCase().charAt(0) == 'L') leftThumb = findKey(keypad, num);
					else rightThumb = findKey(keypad, num);
				}else if(left < right) {
					answer += "L";
					leftThumb = findKey(keypad, num);
				}else {
					answer += "R";
					rightThumb = findKey(keypad, num);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }, "right"));
		System.out.println(solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, "right"));
	}
}