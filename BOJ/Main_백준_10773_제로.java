import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_10773_제로 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int K = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		while(0 < K--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 0 && !stack.isEmpty()) stack.pop();
			else stack.push(num);
		}
		
		int answer = 0;
		while(!stack.isEmpty()) answer += stack.pop();
		
		System.out.print(answer);
	}
}