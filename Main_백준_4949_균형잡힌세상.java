import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = null;
		while(true){
			String line = br.readLine();
			
			if(line.charAt(0) == '.') return;
			
			stack = new Stack<>();
			
			boolean flag = true;
			for(int i=0;i<line.length();i++){
				if(line.charAt(i) == '(' || line.charAt(i) == '[') stack.push(line.charAt(i));
				
				if(line.charAt(i) == ')' || line.charAt(i) == ']') {
					char ch = line.charAt(i);
					
					if(ch == ')'){
						if(stack.isEmpty() || stack.pop() != '(') {
							flag = false;
							break;
						}
					}else if(stack.isEmpty() || stack.pop() != '[') {
						flag = false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty()) flag = false;
			
			if(flag) System.out.println("yes");
			else System.out.println("no");
		}
	}
}