import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D4_1223_계산기2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int len = Integer.parseInt(st.nextToken());
			String infix = br.readLine().trim();
			
			StringBuilder sb = new StringBuilder();
			Stack<Character> operator = new Stack<>();
			
			// 중위표기식 -> 후위표기식
			for(int i=0;i<len;i++) {
				char ch = infix.charAt(i);
				
				if(ch == '+') {
					if(!operator.isEmpty() && operator.peek() == '*') {
						while(!operator.isEmpty()) sb.append(operator.pop());
						
						operator.push(ch);
					}else operator.push(ch);
				}else if(ch == '*') operator.push(ch);
				else sb.append(ch);
			}
			
			while(!operator.isEmpty()) sb.append(operator.pop());
			
			String postfix = sb.toString();
			Stack<Integer> stack = new Stack<>();

			// 후위표기식 계산
			for(int i=0;i<len;i++) {
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