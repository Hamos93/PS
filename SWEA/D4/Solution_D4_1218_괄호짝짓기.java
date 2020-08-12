import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D4_1218_괄호짝짓기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		for(int tc=1;tc<=10;tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int len = Integer.parseInt(st.nextToken());

			String line = br.readLine().trim();

			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			for(int i=0;i<len;i++) {
				char bracket1 = line.charAt(i);

				if(bracket1 == '(' || bracket1 == '[' || bracket1 == '{' || bracket1 == '<') stack.push(bracket1);
				else {
					if(stack.isEmpty()) {
						flag = false;
						break;
					}
					
					char bracket2 = stack.pop();
					if((bracket2 == '(' && bracket1 != ')') ||
					   (bracket2 == '[' && bracket1 != ']') ||
					   (bracket2 == '{' && bracket1 != '}') ||
					   (bracket2 == '<' && bracket1 != '>')) {
						flag = false;
						break;
					}
				}
			}
			
			if(flag) System.out.println("#" + tc + " 1");
			else System.out.println("#" + tc + " 0");
		}
	}
}