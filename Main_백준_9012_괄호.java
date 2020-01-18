import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_백준_9012_괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0){
			Stack<Character> stack = new Stack<>();

			String VPS = br.readLine().trim();
			boolean flag = true;
			for(int i=0;i<VPS.length();i++){
				if(VPS.charAt(i) == '(') stack.push(VPS.charAt(i));
				else {
					if(stack.isEmpty() || stack.pop() != '(') {
						flag = false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty()) flag = false;
			
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}