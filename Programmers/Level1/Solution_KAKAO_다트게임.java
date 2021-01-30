import java.util.Stack;

public class Solution_KAKAO_다트게임 {
	public static int solution(String dartResult) {
		char[] arr = dartResult.toCharArray();
		int len = arr.length;

		Stack<int[]> stack = new Stack<>();
		for(int i=0;i<len;i++) {
			int num = arr[i] - '0';
			if(0 <= num && num <= 9) {
				if(num == 1 && arr[i+1] - '0' == 0) {
					stack.push(new int[] { 10, 0 });
					i++;
				}else stack.push(new int[] { num, 0 });

				continue;
			}

			char bonus = arr[i];
			if(bonus == 'S' || bonus == 'D' || bonus == 'T') {
				int x = 0;

				if(bonus == 'S') x = 1;
				if(bonus == 'D') x = 2;
				if(bonus == 'T') x = 3;

				int[] pop = stack.pop();
				stack.push(new int[] { (int)Math.pow(pop[0], x), pop[1] });

				continue;
			}

			char option = arr[i];
			if(option == '*') {
				if(stack.size() == 1) {
					int[] pop = stack.pop();
					stack.push(new int[] { 2 * pop[0], 1 });
				}else {
					int[] pop1 = stack.pop();
					int[] pop2 = stack.pop();

					stack.push(new int[] { 2 * pop2[0], pop2[1] });
					stack.push(new int[] { 2 * pop1[0], 1 });
				}
			}else {
				int[] pop = stack.pop();
				stack.push(new int[] { -1 * pop[0], 1 });
			}
		}

		int answer = 0;
		while(!stack.isEmpty()) 
			answer += stack.pop()[0];

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}
}