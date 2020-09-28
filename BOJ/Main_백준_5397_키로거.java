import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_5397_키로거 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());
		for(int tc=1;tc<=T;tc++) {
			char[] password = br.readLine().toCharArray();
			int len = password.length;
			
			Stack<Character> stack1 = new Stack<>();
			Stack<Character> stack2 = new Stack<>();
			for(int i=0;i<len;i++) {
				char ch = password[i];

				switch (ch) {
				case '<':
					if(!stack1.isEmpty()) stack2.push(stack1.pop());
					break;
				case '>':
					if(!stack2.isEmpty()) stack1.push(stack2.pop());
					break;
				case '-':
					if(!stack1.isEmpty()) stack1.pop();
					break;
				default:
					stack1.push(ch);
					break;
				}
			}
			
			while(!stack2.isEmpty()) stack1.push((stack2.pop()));
			
			StringBuilder sb = new StringBuilder();
			while(!stack1.isEmpty()) sb.append(stack1.pop());
			
			System.out.println(sb.reverse().toString());
		}
	}
}