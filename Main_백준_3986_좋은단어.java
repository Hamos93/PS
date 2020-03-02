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
		while(N-- > 0){
			Stack<Character> stack = new Stack<>();
			
			String word = br.readLine().trim();

			for(int i=0;i<word.length();i++){
				char ch = word.charAt(i);
				
				if(stack.isEmpty() || stack.peek() != ch) stack.push(ch);
				else if(stack.peek() == ch) stack.pop();
			}
			
			if(stack.isEmpty()) answer++;
		}
		
		System.out.print(answer);
	}
}