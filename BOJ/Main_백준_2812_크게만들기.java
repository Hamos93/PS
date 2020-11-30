import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_2812_크게만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		char[] input = br.readLine().toCharArray();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(input[0] - '0');
	
		for(int i=1;i<N;i++) {
			int value = input[i] - '0';
			
			while(!stack.isEmpty() && stack.peek() < value && 0 < K) {
				stack.pop();
				K--;
			}
			
			stack.push(value);
		}
		
		while(0 < K--) stack.pop();
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) sb.append(stack.pop());
	
		System.out.print(sb.reverse().toString());
	}
}