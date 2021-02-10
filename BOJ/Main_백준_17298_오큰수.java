import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_17298_오큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<>();
		int[] NGE = new int[N];
		for(int i=N-1;0<=i;i--) {
			if(i == N-1) {
				NGE[i] = -1;
				stack.push(A[i]);
				
				continue;
			}
			
			if(A[i] < stack.peek()) {
				NGE[i] = stack.peek();
				stack.push(A[i]);
			}else {
				while(!stack.isEmpty() && stack.peek() <= A[i]) stack.pop();
				
				if(stack.isEmpty()) NGE[i] = -1;
				else NGE[i] = stack.peek();
				
				stack.push(A[i]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int value : NGE)
			sb.append(value + " ");
		
		System.out.print(sb.toString().trim());
	}
}