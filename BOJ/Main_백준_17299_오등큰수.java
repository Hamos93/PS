import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_17299_오등큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			A[i] = Integer.parseInt(st.nextToken());
			
			if(hashMap.containsKey(A[i])) hashMap.put(A[i], hashMap.get(A[i]) + 1);
			else hashMap.put(A[i], 1);
		}

		int[] NGF = new int[N];
		Stack<int[]> stack = new Stack<>();
		
		for(int i=N-1;0<=i;i--) {
			if(i == N-1) {
				NGF[i] = -1;
				stack.push(new int[] { A[i], hashMap.get(A[i]) });
				
				continue;
			}
			
			if(hashMap.get(A[i]) < stack.peek()[1]) {
				NGF[i] = stack.peek()[0];
				stack.push(new int[] { A[i], hashMap.get(A[i]) });
			}else {
				while(!stack.isEmpty() && stack.peek()[1] <= hashMap.get(A[i])) stack.pop();
				
				if(stack.isEmpty()) NGF[i] = -1;
				else NGF[i] = stack.peek()[0];
				
				stack.push(new int[] { A[i], hashMap.get(A[i]) });
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int value : NGF)
			sb.append(value + " ");
		
		System.out.print(sb.toString().trim());
	}
}