import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_12798_도키도키간식드리미 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		LinkedList<Integer> queue = new LinkedList<>();
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) 
			queue.offer(Integer.parseInt(st.nextToken()));
		
		Stack<Integer> stack = new Stack<>();
		int idx = 1;

		while(!queue.isEmpty()) {
			int order = queue.peek();
			
			if(idx != order) {
				if(!stack.isEmpty() && stack.peek() == idx) {
					stack.pop();
					idx++;
				}else stack.push(queue.poll());
			}else {
				queue.poll();
				idx++;
			}
		}
		
		boolean flag = true;
		while(!stack.isEmpty()) {
			int order = stack.pop();
			if(idx != order) {
				flag = false;
				break;
			}else idx++;
		}
		
		if(flag) System.out.print("Nice");
		else System.out.print("Sad");
	}
}