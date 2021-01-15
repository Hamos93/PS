import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_14405_피카츄 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int len = input.length();
		
		Stack<Character> stack = new Stack<>();
		for(int i=len-1;0<=i;i--)
			stack.push(input.charAt(i));
	
		boolean flag = true;
		while(!stack.isEmpty()) {
			char ch = stack.pop();
			
			if(ch == 'p') {
				if(!stack.isEmpty() && stack.peek() == 'i') stack.pop();
				else {
					flag = false;
					break;
				}
			}else if(ch == 'k') {
				if(!stack.isEmpty() && stack.peek() == 'a') stack.pop();
				else {
					flag = false;
					break;
				}
			}else if(ch == 'c') {
				if(!stack.isEmpty() && stack.peek() == 'h') {
					stack.pop();
					
					if(!stack.isEmpty() && stack.peek() == 'u') stack.pop();
					else {
						flag = false;
						break;
					}
				}else {
					flag = false;
					break;
				}
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.print("YES");
		else System.out.print("NO");
	}
}