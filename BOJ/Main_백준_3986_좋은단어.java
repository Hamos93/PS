import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_3986_좋은단어 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(0 < N--) {
			String str = br.readLine().trim();
			
			Stack<Character> stack = new Stack<>();
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				
				if(stack.isEmpty()) stack.push(ch);
				else {
					if(stack.peek() == ch) stack.pop();
					else stack.push(ch);
				}
			}
			
			if(stack.isEmpty()) answer++;
		}
		
		System.out.print(answer);
	}
}