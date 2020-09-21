import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_17413_단어뒤집기2 {
	private static void printStack(Stack<Character> stack) {
		while(!stack.isEmpty()) System.out.print(stack.pop());
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int len = S.length();

		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		for(int i=0;i<len;i++) {
			char ch = S.charAt(i);

			if(ch == '<') {
				printStack(stack);
				flag = true;

				System.out.print(ch);
			}else if(ch == '>') {
				flag = false;
				
				System.out.print(ch);
			}else if(flag) System.out.print(ch);
			else {
				if(ch == 32) {
					printStack(stack);
					
					System.out.print(ch);
				}else stack.push(ch);
			}
		}
		
		printStack(stack);
	}
}