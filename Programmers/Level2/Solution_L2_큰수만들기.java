import java.util.Stack;

public class Solution_L2_큰수만들기 {
	public static String solution(String number, int k) {
		Stack<Character> stack = new Stack<>();

		for(int i=0;i<number.length();i++) {
			char num = number.charAt(i);

			if(stack.isEmpty() || num <= stack.peek()) stack.push(num);
			else {
				while(!stack.isEmpty() && stack.peek() < num && 0 < k) {
					stack.pop();
					k--;
				}

				stack.push(num);
			}
		}

		while(0 < k--) stack.pop();
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) sb.append(stack.pop());

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(solution("1924", 2));
		System.out.println(solution("1231234", 3));
		System.out.println(solution("4177252841", 4));
		System.out.println(solution("12345", 4));
		System.out.println(solution("54321", 4));
	}
}