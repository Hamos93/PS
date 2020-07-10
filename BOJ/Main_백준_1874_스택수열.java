import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_1874_스택수열 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		while(0 < n--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num1 = Integer.parseInt(st.nextToken());
			if(idx <= num1) {
				for(int i=idx;i<=num1;i++) {
					stack.push(i);
					sb.append("+\n");
				}
				
				stack.pop();
				sb.append("-\n");
			
				idx = num1 + 1;
			}else {
				int num2 = stack.pop();
				
				if(num1 != num2) {
					System.out.println("NO");
					return;
				}else sb.append("-\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}