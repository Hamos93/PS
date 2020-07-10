import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String line = br.readLine();
			
			if(line.charAt(0) == '.') return;
			
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i) == '(' || line.charAt(i) == '[') stack.push(line.charAt(i));
				if(line.charAt(i) == ')' || line.charAt(i) == ']') {
					if(stack.isEmpty() || (line.charAt(i) == ')' && stack.peek() != '(') || (line.charAt(i) == ']' && stack.peek() != '[')) {
						flag = false;
						break;
					}else stack.pop();
				}
			}
			
			if(!stack.isEmpty()) flag = false;
			
			if(!flag) System.out.println("no");
			else System.out.println("yes");
		}
	}
}