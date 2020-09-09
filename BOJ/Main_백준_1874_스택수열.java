import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_1874_스택수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>(); 
		
		int i = 1;
		while(0 < n--) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			
			while(stack.isEmpty() || stack.peek() < num) {
				stack.push(i++);
				sb.append("+\n");
			}
			
			if(stack.peek() == num) {
				stack.pop();
				sb.append("-\n");
			}else {
				System.out.print("NO");
				return;
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}