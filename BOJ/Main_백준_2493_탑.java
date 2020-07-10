import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_2493_탑 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		Stack<int[]> stack = new Stack<>();
		int idx = 1;

		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			int height = Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty() && stack.peek()[0] < height) stack.pop();
			
			if(stack.isEmpty()) {
				sb.append("0 ");
				stack.push(new int[] { height, idx++ });
			}else {
				sb.append(stack.peek()[1] + " ");
				stack.push(new int[] { height, idx++ });
			}
		}
		
		System.out.print(sb.toString().trim());
	}
}