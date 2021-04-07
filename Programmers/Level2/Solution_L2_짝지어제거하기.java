import java.util.Stack;

public class Solution_L2_짝지어제거하기 {
	public static int solution(String s) {
		Stack<Character> stack = new Stack<>();

		int len = s.length();
		for(int i=0;i<len;i++) {
			char ch = s.charAt(i);
			
			if(stack.isEmpty() || stack.peek() != ch) stack.push(ch);
			else stack.pop();
		}
		
		if(stack.isEmpty()) return 1;
		else return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
	}
}