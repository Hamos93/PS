import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_1935_후위표기식2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		String line = br.readLine().trim();
		String[] postfix = new String[line.length()];
		for(int i=0;i<postfix.length;i++)
			postfix[i] = line.substring(i, i + 1);
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String num = st.nextToken();
			
			StringBuilder sb = new StringBuilder();
			sb.append((char)(i + 65));
			
			for(int j=0;j<postfix.length;j++) {
				if(postfix[j].equals(sb.toString()))
					postfix[j] = num;
			}
		}
		
		Stack<Double> stack = new Stack<>();
		for(int i=0;i<postfix.length;i++) {
			String value = postfix[i];
			
			if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
				double operand1 = stack.pop();
				double operand2 = stack.pop();
				
				switch (value) {
				case "+":
					stack.push(operand2 + operand1);
					break;
				case "-":
					stack.push(operand2 - operand1);
					break;
				case "*":
					stack.push(operand2 * operand1);
					break;
				case "/":
					stack.push(operand2 / operand1);
					break;

				default:
					break;
				}
			}else stack.push(Double.parseDouble(value));
		}
		
		System.out.format("%.2f", stack.pop());
	}
}