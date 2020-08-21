import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_17608_막대기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			stack.push(Integer.parseInt(st.nextToken()));
		}
		
		int height = stack.pop();
		int cnt = 1;
		
		while(true) {
			while(!stack.isEmpty() && stack.peek() <= height) stack.pop();
			
			if(stack.isEmpty()) break;
			
			height = stack.pop();
			cnt++;
		}
		
		System.out.print(cnt);
	}
}