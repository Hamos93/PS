import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_10828_스택 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		while(0 < N--) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			switch (command) {
			case "push":
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
				break;
			case "pop":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.isEmpty()) System.out.println("1");
				else System.out.println("0");
				break;
			case "top":
				if(stack.isEmpty()) System.out.println("-1");
				else System.out.println(stack.peek());
				break;
			}
		}
	}
}