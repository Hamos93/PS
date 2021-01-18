import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_15815_천재수학자성필 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int len = input.length();

		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<len;i++) {
			char value = input.charAt(i);

			if(value == '+') {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				
				stack.push(operand2 + operand1);
			}else if(value == '-') {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				
				stack.push(operand2 - operand1);
			}else if(value == '*') {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				
				stack.push(operand2 * operand1);
			}else if(value == '/') {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				
				stack.push(operand2 / operand1);
			}else stack.push(value - '0');
		}
		
		System.out.print(stack.pop());
	}
}