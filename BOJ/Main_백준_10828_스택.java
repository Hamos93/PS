import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_10828_스택 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(st.nextToken());
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			if(command.equals("push")) {
				int value = Integer.parseInt(st.nextToken());
				stack.push(value);
			}
			
			if(command.equals("pop")){
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.pop());
			}
			
			if(command.equals("size")) System.out.println(stack.size());
			
			if(command.equals("empty")) {
				if(stack.isEmpty()) System.out.println("1");
				else System.out.println("0");
			}
			
			if(command.equals("top")){
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.peek());
			}
		}
	}
}