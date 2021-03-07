import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_백준_2568_전깃줄2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] powerPole = new int[500001];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			powerPole[A] = B;
		}
		
		int[] LIS = new int[500001];
		LIS[1] = powerPole[1];
		
		int[][] value = new int[500001][2];
		value[1][0] = 1;
		value[1][1] = powerPole[1];
		
		int idx = 1;
		for(int i=2;i<=500000;i++) {
			if(powerPole[i] == 0) 
				continue;
			
			if(LIS[idx] < powerPole[i]) {
				LIS[++idx] = powerPole[i];
				
				value[i][0] = idx;
				value[i][1] = powerPole[i];
			}else {
				int low = 1, high = idx;
			
				while(low < high) {
					int mid = (low + high) / 2;
					
					if(LIS[mid] < powerPole[i]) low = mid + 1;
					else high = mid;
				}
				
				LIS[high] = powerPole[i];
				
				value[i][0] = high;
				value[i][1] = powerPole[i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1;i<=500000;i++) {
			if(max < value[i][0])
				max = value[i][0];
		}
		
		Stack<Integer> stack = new Stack<>();
		for(int i=500000;1<=i;i--) {
			if(value[i][0] == 0) continue;
			
			if(0 < max && value[i][0] == max) max--;
			else stack.push(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append((stack.size()) + "\n");
		
		while(!stack.isEmpty()) sb.append(stack.pop() + "\n");
		
		System.out.print(sb.toString().trim());
	}
}