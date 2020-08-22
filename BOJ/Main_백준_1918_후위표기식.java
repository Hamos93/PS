import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_1918_후위표기식 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 중위표기식 -> 후위표기식: 피연산자의 경우 바로 출력, 연산자의 경우 스택으로 연산의 순서 조정
		String infix = br.readLine().trim();

		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<infix.length();i++) {
			char ch = infix.charAt(i);

			// 연산자인 경우 우선순위가 같거나 동일하면 pop
			if(ch == '(' || ch == ')' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				switch (ch) {
				case '(':
					stack.push(ch);
					
					break;
				case ')':
					// '(' 만날 때까지 pop
					while(true) {
						char op = stack.pop();
						
						if(op == '(') break;
						else sb.append(op);
					}

					break;
				case '+':
				case '-':
					while(!stack.isEmpty() && (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/')) sb.append(stack.pop());
					
					stack.push(ch);
					
					break;
				case '*':
				case '/':
					while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) sb.append(stack.pop());
					
					stack.push(ch);
					
					break;
				}
			}else sb.append(ch);
		}
		
		while(!stack.isEmpty()) sb.append(stack.pop());
		
		System.out.print(sb.toString());
	}
}