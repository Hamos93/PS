import java.util.Stack;

public class Solution_L2_올바른괄호 {
	public static boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		
		boolean flag = true;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') stack.push(ch);
			else {
				if(stack.isEmpty()) {
					flag = false;
					break;
				}
				
				if(stack.peek() == '(') stack.pop();
				else {
					flag = false;
					break;
				}
			}
		}
		
		if(!stack.isEmpty()) flag = false;

		return flag;
	}

	public static void main(String[] args) {
		System.out.print(solution("()()"));
	}
}