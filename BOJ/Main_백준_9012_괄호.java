import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_9012_괄호 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			String VPS = br.readLine().trim();
			
			Stack<Character> stack = new Stack<>();
			boolean flag = true;
			for(int i=0;i<VPS.length();i++) {
				if(VPS.charAt(i) == '(') stack.push(VPS.charAt(i));
				else {
					if(stack.isEmpty() || stack.peek() == ')' ) {
						flag = false;
						break;
					}else stack.pop();
				}
			}

			if(!stack.isEmpty()) flag = false;
			
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}