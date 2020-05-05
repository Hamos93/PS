import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_10773_제로 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		Stack<Integer> stack = new Stack<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		
		while(K-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			int value = Integer.parseInt(st.nextToken());
			
			if(value == 0) stack.pop();
			else stack.push(value);
		}
		
		int answer = 0;
		while(!stack.isEmpty()) answer += stack.pop();
		
		System.out.print(answer);
	}
}