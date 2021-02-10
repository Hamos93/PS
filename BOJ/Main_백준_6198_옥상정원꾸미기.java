import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_6198_옥상정원꾸미기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		long cnt = 0;
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			
			if(stack.isEmpty() || h < stack.peek()) {
				if(!stack.isEmpty()) 
					cnt += stack.size();
				
				stack.push(h);
			}else {
				while(!stack.isEmpty() && stack.peek() <= h) stack.pop();
				
				if(stack.isEmpty()) stack.push(h);
				else {
					cnt += stack.size();
					stack.push(h);
				}
			}
		}
		
		System.out.print(cnt);
	}
}