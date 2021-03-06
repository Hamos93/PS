import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_14003_가장긴증가하는부분수열5 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++)
			A[i] = Integer.parseInt(st.nextToken());
		
		int[] LIS = new int[N];
		LIS[0] = A[0];
		
		int[][] value = new int[N][2];
		value[0][0] = 0;
		value[0][1] = A[0];
		
		int idx = 0;
		for(int i=1;i<N;i++) {
			if(LIS[idx] < A[i]) {
				LIS[++idx] = A[i];
				
				value[i][0] = idx;
				value[i][1] = A[i];
			}else {
				int low = 0, high = idx;
				while(low < high) {
					int mid = (low + high) / 2;
					
					if(LIS[mid] < A[i]) low = mid + 1;
					else high = mid;
				}
				
				LIS[high] = A[i];
				
				value[i][0] = high;
				value[i][1] = A[i];
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append((idx + 1) + "\n");
		
		int len = Integer.MIN_VALUE, lenIdx = 0;
		for(int i=0;i<N;i++) {
			if(len < value[i][0]) {
				len = value[i][0];
				lenIdx = i;
			}
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(value[lenIdx][1]);
		
		for(int i=lenIdx;0<=i;i--) {
			if(value[i][0] == len - 1) {
				len = value[i][0];
				
				stack.push(value[i][1]);
			}
		}
		
		while(!stack.isEmpty()) 
			sb.append(stack.pop() + " ");
		
		System.out.print(sb.toString().trim());
	}
}