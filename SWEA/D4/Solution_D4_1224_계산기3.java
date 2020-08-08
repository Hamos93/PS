import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D4_1224_계산기3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int len = Integer.parseInt(st.nextToken());
			String infix = br.readLine().trim();
			
			StringBuilder sb = new StringBuilder();
			Stack<Character> operator = new Stack<>();
			
			int bracket = 0;
			// 중위표기식 -> 후위표기식
			for(int i=0;i<len;i++) {
				char ch = infix.charAt(i);
				
				if(ch == '(') {
					bracket++;
					operator.push(ch);
				}else if(ch == '+') {
					if(!operator.isEmpty() && operator.peek() == '*') {
						while(operator.peek() == '*') sb.append(operator.pop());
						
						operator.push(ch);
					}else operator.push(ch);
				}else if(ch == '*') operator.push(ch);
				else if(ch == ')') {
					bracket++;
					while(operator.peek() != '(') sb.append(operator.pop());
					
					operator.pop();
				}else sb.append(ch);
			}
			
			while(!operator.isEmpty()) {
				char num = operator.pop();
	
				if(num != '(') sb.append(num);
			}
			
			String postfix = sb.toString();
			Stack<Integer> stack = new Stack<>();

			// 후위표기식 계산
			for(int i=0;i<len-bracket;i++) {
				if(postfix.charAt(i) != '+' && postfix.charAt(i) != '*') stack.push(postfix.charAt(i) - '0');
				else {
					int a = stack.pop();
					int b = stack.pop();
					
					if(postfix.charAt(i) == '+') stack.push(a + b);
					if(postfix.charAt(i) == '*') stack.push(a * b);
				}
			}
			
			System.out.println("#" + tc + " " + stack.pop());
		}
	}
}